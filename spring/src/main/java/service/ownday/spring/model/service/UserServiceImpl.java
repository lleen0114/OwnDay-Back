package service.ownday.spring.model.service;

import org.springframework.stereotype.Service;
import service.ownday.spring.model.dto.User;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public User getUserInfo(String userId) {
        return null;
    }

    @Override
    public int registUser(User user) {
        return 0;
    }

    @Override
    public User login(User user) {
        return null;
    }
}
