package com.ownday.controller;

import com.ownday.model.dto.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ownday.model.dto.User;
import com.ownday.model.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //1. 유저 Id로 유저 가져오기
    @GetMapping("/id")
    public ResponseEntity<?> selectUserById(@RequestParam(name = "userId") String userId){
        User user = userService.getUserInfo(userId);

        if(user != null){
            return new ResponseEntity<User>(user, HttpStatus.OK);
        }
        else
            return new ResponseEntity<String>("Can't find user.", HttpStatus.NO_CONTENT);
    }

    //2. User 객체를 받아서 로그인 시키기
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
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
    public ResponseEntity<Integer> regist(@RequestBody User user){

        String registId = user.getUserId();
        String registNickname = user.getUserNickName();
        User checkUser = userService.getUserInfo(registId);
        User checkNickname = userService.getUserInfoByNickname(registNickname);

        //id가 중복되지 않으면 회원가입 시키기
        if(checkUser == null && checkNickname == null){
            userService.registUser(user);
            return new ResponseEntity<>(1, HttpStatus.OK);
        }
        //근데 아이디가 겹치는 유저가 있으면 회원가입 실패 시키기
        else{
            return new ResponseEntity<>(0, HttpStatus.NO_CONTENT);
        }
    }

    //4. 등록되어있는 모든 유저 가져오기
    @GetMapping("/alluser")
    public ResponseEntity<?> getAlluser(){
        List<User> listUser = userService.getAllUser();
        if(listUser != null){
            return new ResponseEntity<List>(listUser, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<String>("Nothing", HttpStatus.NO_CONTENT);
        }
    }

    //1. 유저 Id로 유저 객체 가져오기
    //2. 유저 객체를 받아서 User로그인 시키기
    //3. ID, Nickname 중 한개라도 이미 사용된 것이라면 회원가입 실패
}
