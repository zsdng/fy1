package cn.fy.service;

import cn.fy.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    /**
     * 根据id查询
     */

    User findByid(Integer id);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(User user);
}
