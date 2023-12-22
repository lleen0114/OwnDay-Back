package service.ownday.spring.model.service;

import service.ownday.spring.model.dto.User;

public interface UserService {
    //1. 유저 Id로 유저 정보 가져오기
    User getUserInfo(String userId);

    //2. 유저 객체를 받아서 회원가입 시키기
    int registUser(User user);

    //3. 유저 객체를 받아서 로그인 시키기
    User login(User user);
}
