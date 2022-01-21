package edu.zhuoxun.demo4.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import edu.zhuoxun.demo4.entry.Category;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Jash
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
    @Insert("<script>" +
            "insert into category(cid,cname) values" +
            "<foreach collection='list' item='c' separator=','>" +
            "(#{c.id}, #{c.name})" +
            "</foreach>" +
            "</script>")
    int insertBatch(List<Category> list);
}
