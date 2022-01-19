package edu.zhuoxun.demo4.entry;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * Created by Jash
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @TableId
    private String pid;
    private String pname;
    private Double marketPrice;
    private Double shopPrice;
    private String pimage;
    private Date pdate;
    private Boolean isHot;
    private String pdesc;
    private Boolean pflag;
    private String cid;
}
