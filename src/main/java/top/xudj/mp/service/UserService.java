package top.xudj.mp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import top.xudj.mp.model.User;
import top.xudj.mp.model.UserDto;

import java.util.List;

public interface UserService extends IService<User> {

    List<User> findUserByName(String name);

    Long getIdNext ();

    IPage<UserDto> queryPageDto();

    IPage<User> queryPage();
}
