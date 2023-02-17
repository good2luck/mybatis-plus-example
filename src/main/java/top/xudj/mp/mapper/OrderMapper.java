package top.xudj.mp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import top.xudj.mp.model.Orders;
import top.xudj.mp.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper extends BaseMapper<Orders> {

    @Select("select * from `orders` where name = #{name}")
    List<User> findOrderByName(@Param("name") String name);

}
