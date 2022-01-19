package edu.zhuoxun.demo4.entry;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * Created by Jash
 */
@Data
@Component
public class Person {
    public Person(User user, int age) {
        this.name = user.getName();
        this.age = age;
    }

    private String name;
    private int age;
}
