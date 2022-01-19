package edu.zhuoxun.demo4.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.zhuoxun.demo4.entry.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Jash
 */
@Mapper
public interface ProductDao extends BaseMapper<Product> {
}
