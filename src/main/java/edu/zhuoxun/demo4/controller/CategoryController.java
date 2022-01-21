package edu.zhuoxun.demo4.controller;

import edu.zhuoxun.demo4.dao.CategoryDao;
import edu.zhuoxun.demo4.entry.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Jash
 */
@RestController
public class CategoryController {
    private final CategoryDao categoryDao;

    public CategoryController(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }
    @PostMapping("/category/list")
    public List<Category> getCategories() {
        return categoryDao.selectList(null);
    }
}
