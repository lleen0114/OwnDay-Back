package service.ownday.spring.model.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ownday.spring.model.dao.UserDao;
import service.ownday.spring.model.dto.User;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private UserDao userDao;

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
}
