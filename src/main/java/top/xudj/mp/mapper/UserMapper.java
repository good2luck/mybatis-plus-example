package top.xudj.mp.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import top.xudj.mp.model.User;
import top.xudj.mp.model.UserDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    List<User> findUserByName(@Param("name") String name);

    IPage<UserDto> selectPageDto(IPage<UserDto> page, @Param("ew") Wrapper<User> queryWrapper);
}
