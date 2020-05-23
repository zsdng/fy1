package cn.fy.controller;

import cn.fy.domain.Ars;
import cn.fy.service.ArsService;
import cn.fy.utils.GetIp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class GetIpController {

    @Autowired
    private ArsService arsService;

    public void setArsService(ArsService arsService) {
        this.arsService = arsService;
    }

    @RequestMapping("/aip")
    @ResponseBody
    public String getIp(HttpServletRequest request){
        String aip = GetIp.getClientIp(request);
        arsService.addIp(new Ars(aip,"查询ip"));
        return aip;
    }

    @RequestMapping("/getGame")
    @ResponseBody
    public String getGame(HttpServletRequest request){
        String aip = GetIp.getClientIp(request);
        arsService.addIp(new Ars(aip,"点小游戏"));
        return aip;
    }


}
