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

import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.List;

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
//        productDao.selectList(new QueryWrapper<>()).forEach(System.out::println);
//        System.out.println("===================");
//        Page<Product> page = new Page<>(1, 10);
//        Page<Product> productPage = productDao.selectPage(page, new QueryWrapper<Product>().eq(true, "cid", "2"));
//        System.out.println("当前页 = " + productPage.getCurrent());
//        System.out.println("总数 = " + productPage.getTotal());
//        System.out.println("总页数 = " + productPage.getPages());
//        productPage.getRecords().forEach(System.out::println);
//        List<Category> categories = dao.selectList(null);
//        categories.forEach(category -> {
//            System.out.println(category);
//            productDao.selectByCategory(category).forEach(System.out::println);
//            System.out.println("===================");
//        });
//        List<Category> list = new ArrayList<>();
//        for (int i = 0; i < 100; i++) {
//            list.add(new Category(String.format("id%03d", i), String.format("测试%03d", i)));
//        }
//        long l = System.currentTimeMillis();
////        list.forEach(dao::insert);
//        System.out.println(dao.insertBatch(list));
//        System.out.println(System.currentTimeMillis() - l);
//        int i = dao.updateById(new Category("id0100", "修改分类"));
//        int i = dao.update(new Category(null, "批量修改"), new QueryWrapper<Category>().likeRight("cid", "id"));
//        System.out.println("i = " + i);

//        int i = dao.deleteBatchIds(List.of("id010", "id020", "id030", "id000000"));
//        int i = dao.delete(new QueryWrapper<Category>().likeRight("cid", "id"));
//        System.out.println("i = " + i);
        productDao.selectByCname("电脑办公").forEach(System.out::println);
    }
    void test(String cid) {
        List<Product> list = productDao.selectList(new QueryWrapper<Product>().eq(cid != null, "cid", cid));
    }

}
