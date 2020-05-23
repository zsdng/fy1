package com.test;

import cn.fy.dao.RoleDao;
import cn.fy.dao.UserDao;
import cn.fy.domain.Role;
import cn.fy.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class) //声明spring提供的单元测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")//指定spring容器的配置信息
public class ManytoMany {
    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Test
    @Transactional
    @Rollback(false)
    public void testadd() {

        User user =new User();
        Role role =new Role();
        user.setUserName("方用户");
        role.setRoleName("圆角色");
        user.getRoles().add(role);
//        role.getUsers().add(user);

        userDao.delete(user);
//        roleDao.save(role);
    }
}
