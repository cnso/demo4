package edu.zhuoxun.demo4.controller;

import edu.zhuoxun.demo4.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jash
 */
@RestController
public class LoginController {
    private final User admin;

    public LoginController(User admin) {
        this.admin = admin;
    }


    @PostMapping("/login")
    @ResponseBody
    public ModelAndView login(User user){
        ModelAndView modelAndView = new ModelAndView("login-view");
        if (user.getName().equals(admin.getName()) && user.getPassword().equals(admin.getPassword())){
            modelAndView.addObject("result", "登录成功") ;
        } else {
            modelAndView.addObject("result", "登录失败") ;
        }
        return modelAndView;
    }
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView view = new ModelAndView("index");
        return view;
    }
}
