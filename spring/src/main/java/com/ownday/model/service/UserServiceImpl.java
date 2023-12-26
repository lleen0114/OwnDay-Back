package com.ownday.model.service;

import com.ownday.model.dao.UserDao;
import com.ownday.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public User getUserInfo(String userId) {
        return userDao.getUserInfo(userId);
    }

    @Override
    public User getUserInfoByNickname(String nickname) {
        return userDao.getUserInfoByNickname(nickname);
    }

    @Override
    public int registUser(User user) {
        return userDao.registUser(user);
    }

    @Override
    public User login(User user) {
        return userDao.login(user);
    }

    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
