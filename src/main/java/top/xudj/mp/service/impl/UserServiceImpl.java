package top.xudj.mp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import top.xudj.mp.mapper.UserMapper;
import top.xudj.mp.model.User;
import top.xudj.mp.model.UserDto;
import top.xudj.mp.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    private Long curId = -1L;

    @Override
    public List<User> findUserByName(String name) {
        return getBaseMapper().findUserByName(name);
    }

    @Override
    public Long getIdNext () {
        if (curId == -1) {
            LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
            queryWrapper.orderByDesc(User::getId);
            User one = super.getOne(queryWrapper, false);
            if (one == null) {
                curId = 1L;
            } else {
                curId = one.getId() + 1;
            }
        }
        return ++curId;
    }

    @Override
    public IPage<UserDto> queryPageDto() {
        String name = "haha";
        Integer age = 1;
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.like(User::getName, name)
                .eq(age != null, User::getAge, age)
                .orderByDesc(User::getId)
                .eq(User::getDeleted, 0);

        IPage<UserDto> page = new Page<>(2, 5);
        IPage<UserDto> re = super.getBaseMapper().selectPageDto(page, queryWrapper);
        return re;
    }

    @Override
    public IPage<User> queryPage() {
        String name = "haha";
        Integer age = 1;
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper();
        queryWrapper.like(User::getName, name)
                .eq(age != null, User::getAge, age);

        IPage<User> page = new Page<>(1, 2);
        IPage<User> re = super.page(page, queryWrapper);
        return re;
    }

}
