package service.ownday.spring.model.dao;

import org.springframework.stereotype.Repository;
import service.ownday.spring.model.dto.User;

import java.util.List;

@Repository
public interface UserDao {
    //1-1. 유저 Id로 유저 정보 가져오기
    User getUserInfo(String userId);

    //1-2. 유저 NickName으로 유저 정보 가져오기
    User getUserInfoByNickname(String nickname);

    //2. 유저 객체를 받아서 회원가입 시키기
    int registUser(User user);

    //3. 유저 객체를 받아서 로그인 시키기
    User login(User user);

    //4. 등록되어있는 유저 리스트 반환시키기
    List<User> getAllUser();
}
