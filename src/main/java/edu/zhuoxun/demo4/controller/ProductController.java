package edu.zhuoxun.demo4.controller;

import edu.zhuoxun.demo4.dao.ProductDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Jash
 */
@RestController
public class ProductController {
    private ProductDao productDao;

    public ProductController(ProductDao productDao) {
        this.productDao = productDao;
    }

    @GetMapping("/product/list")
    public ModelAndView getProducts() {
        ModelAndView view = new ModelAndView("products");
        view.addObject("list", productDao.selectList(null));
        return view;
    }
}
