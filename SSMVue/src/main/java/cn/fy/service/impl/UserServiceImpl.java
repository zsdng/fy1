package cn.fy.service.impl;

import cn.fy.dao.UserDao;
import cn.fy.domain.User;
import cn.fy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }

    @Override
    public User findByid(Integer id) {
        return userDao.findByid(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);

    }
}
