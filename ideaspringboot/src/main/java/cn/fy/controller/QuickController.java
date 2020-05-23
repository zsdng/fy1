package cn.fy.controller;

import cn.fy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "person")
public class QuickController {

    @Autowired
    private UserMapper userMapper;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    private String name;
    private String addr;


    @Value("${cat}")
    private String cat;

    @RequestMapping("/quick")
    public String quick() {
        System.out.println(cat);

        return cat + ":";
    }

    @RequestMapping("/quick2")
    public String quick2() {
        System.out.println(userMapper.queryUserList());

        return name + "/------/"+addr+"所有的用户："+userMapper.queryUserList();
    }


}
