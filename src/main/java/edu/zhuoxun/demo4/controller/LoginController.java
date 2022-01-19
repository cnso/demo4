package edu.zhuoxun.demo4.controller;

import edu.zhuoxun.demo4.entry.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jash
 */
@RestController
public class LoginController {
    @PostMapping("/login")
    @ResponseBody
    public ModelAndView login(User user){
        ModelAndView modelAndView = new ModelAndView("login-view");
        if (user.getName().equals("admin") && user.getPassword().equals("123456")){
            modelAndView.addObject("result", "登录成功") ;
        } else {
            modelAndView.addObject("result", "登录失败") ;
        }
        return modelAndView;
    }
}
