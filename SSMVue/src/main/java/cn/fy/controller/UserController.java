package cn.fy.controller;

import cn.fy.domain.User;
import cn.fy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/findAll")
    public  List<User> findAll(){
        System.out.println("test");
        return userService.findAll();

    }
    @RequestMapping("/findById")
    public User findById(Integer id){

        return userService.findByid(id);
    }

    @RequestMapping("/updateUser")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);

    }



}
