package edu.zhuoxun.demo4.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import edu.zhuoxun.demo4.dao.ProductDao;
import edu.zhuoxun.demo4.entry.Product;
import edu.zhuoxun.demo4.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Jash
 */
@RestController
public class LoginController {
    private final User admin;

    private ProductDao productDao;

    public LoginController(User admin, ProductDao productDao) {
        this.admin = admin;
        this.productDao = productDao;
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
        List<Product> hots = productDao.selectList(new QueryWrapper<Product>().eq("is_hot", "1").orderByDesc("pdate").last("limit 9"));
        List<Product> news = productDao.selectList(new QueryWrapper<Product>().orderByDesc("pdate").last("limit 9"));
        view.addObject("hots", hots);
        view.addObject("news", news);
        return view;
    }
}
