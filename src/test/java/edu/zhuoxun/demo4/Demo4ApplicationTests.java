package edu.zhuoxun.demo4;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import edu.zhuoxun.demo4.dao.CategoryDao;
import edu.zhuoxun.demo4.dao.ProductDao;
import edu.zhuoxun.demo4.entry.Category;
import edu.zhuoxun.demo4.entry.Person;
import edu.zhuoxun.demo4.entry.Product;
import edu.zhuoxun.demo4.entry.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo4ApplicationTests {

    @Autowired
    private User admin;
    @Autowired
    private User user;
    @Autowired
    private Person person;
    @Autowired
    private Person p1;

    @Autowired
    private CategoryDao dao;

    @Autowired
    private ProductDao productDao;

    @Test
    void contextLoads() {
//        dao.selectList(new QueryWrapper<>()).forEach(System.out::println);
//        System.out.println("===========");
//        System.out.println(dao.selectById("1"));
//        System.out.println(dao.selectList(new QueryWrapper<Category>().like("cid", "1")));
        productDao.selectList(new QueryWrapper<>()).forEach(System.out::println);
        System.out.println("===================");
        Page<Product> page = new Page<>(1, 10);
        Page<Product> productPage = productDao.selectPage(page, new QueryWrapper<Product>().eq("cid", "2"));
        System.out.println("当前页 = " + productPage.getCurrent());
        System.out.println("总数 = " + productPage.getTotal());
        System.out.println("总页数 = " + productPage.getPages());
        productPage.getRecords().forEach(System.out::println);
    }

}
