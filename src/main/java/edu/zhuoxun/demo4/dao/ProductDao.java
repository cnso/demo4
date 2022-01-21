package edu.zhuoxun.demo4.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.zhuoxun.demo4.entry.Category;
import edu.zhuoxun.demo4.entry.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Jash
 */
@Mapper
public interface ProductDao extends BaseMapper<Product> {
    @Select("select * from product where cid=#{id}")
    List<Product> selectByCategory(Category category);
    @Select("select p.* from product p left join category c on p.cid=c.cid where c.cname=#{name}")
    List<Product> selectByCname(@Param("name") String name);
}
