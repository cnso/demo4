package edu.zhuoxun.demo4.entry;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * Created by Jash
 */
@Data
public class Category {
    @TableId(value = "cid")
    private String id;
    @TableField(value = "cname")
    private String name;
}
