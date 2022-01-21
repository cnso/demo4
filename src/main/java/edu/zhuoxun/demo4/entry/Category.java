package edu.zhuoxun.demo4.entry;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Jash
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @TableId(value = "cid", type = IdType.AUTO)
    private String id;
    @TableField(value = "cname")
    private String name;
}
