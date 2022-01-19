package edu.zhuoxun.demo4.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import edu.zhuoxun.demo4.entry.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jash
 */
@Configuration
public class MyConfig {

    @Bean(name = "admin")
    public static User getAdmin() {
        return new User("admin", "123456");
    }

    @Bean(name = "user")
    public static User getUser(String name) {
        return new User(name, "654321");

    }
    @Bean(name = "name")
    public static String getName() {
        return "Bean name";
    }
    @Bean(name = "str")
    public static String getStr(){
        return "Bean str";
    }
    @Bean(name = "age")
    public static int getAge() {
        return 30;
    }

    @Bean
    public static MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return mybatisPlusInterceptor;
    }
}
