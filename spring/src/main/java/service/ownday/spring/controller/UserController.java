package service.ownday.spring.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ownday.spring.model.dto.User;
import service.ownday.spring.model.service.UserService;

@RestController
@RequestMapping("/user")
@Tag(name = "유저 컨트롤러", description = "유저 컨트롤러 확인")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    //1. 유저 Id로 유저 가져오기
    @GetMapping("/id")
    public ResponseEntity<?> selectUserById(@RequestParam String id){
        User user = userService.getUserInfo(id);

        if(user != null){
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
        else
            return new ResponseEntity<String>("Can't find user.", HttpStatus.NO_CONTENT);
    }

    //2. User 객체를 받아서 로그인 시키기
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam User user){
        String userId = user.getUserId();
        String userPassword = user.getUserPassword();

        User loginUser = userService.getUserInfo(userId);

        if(loginUser != null && loginUser.getUserPassword().equals(userPassword)){
            return new ResponseEntity<User>(loginUser, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("Please check ID or PW", HttpStatus.NO_CONTENT);
        }
    }

    //3. User 객체를 받아서 회원가입 시키기
    @PostMapping("/regist")
    public ResponseEntity<Integer> regist(@RequestParam User user){

        String registId = user.getUserId();
        String registNickname = user.getUserNickName();
        User checkUser = userService.getUserInfo(registId);
        User checkNickname = userService.getUserInfoByNickname(registNickname);


        //id가 중복되지 않으면 회원가입 시키기
        if(checkUser != null && checkNickname != null){
            userService.registUser(user);
            return new ResponseEntity<>(1, HttpStatus.OK);
        }
        //근데 아이디가 겹치는 유저가 있으면 회원가입 실패 시키기
        else{
            return new ResponseEntity<>(0, HttpStatus.NO_CONTENT);
        }
    }

    //1. 유저 Id로 유저 객체 가져오기
    //2. 유저 객체를 받아서 User로그인 시키기
    //3. ID, Nickname 중 한개라도 이미 사용된 것이라면 회원가입 실패
}
