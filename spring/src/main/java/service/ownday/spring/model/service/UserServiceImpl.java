package service.ownday.spring.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ownday.spring.model.dao.UserDao;
import service.ownday.spring.model.dto.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired(required=false)
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
        return null;
    }
}
