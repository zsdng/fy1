package cn.fy;

import cn.fy.domain.User;
import cn.fy.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test1 {

    @Autowired
    private UserService userService;

    @Test
    public void t1() {
        userService.findAll().forEach(System.out::println);
    }

    @Test
    public void name() {
        System.out.println(userService.findByid(5));
    }

    @Test
    public void name2() {
        User user =new User();

        user = userService.findByid(5);
        user.setAge(1000);
        user.setUsername("王培毅是傻逼");

        userService.updateUser(user);


    }
}
