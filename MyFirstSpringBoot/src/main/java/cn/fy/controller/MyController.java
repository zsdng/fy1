package cn.fy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MyController {


    @RequestMapping("/first")
    @ResponseBody
    public String quick(){

        return "侬好啊 SpringBoot";
    }
}
