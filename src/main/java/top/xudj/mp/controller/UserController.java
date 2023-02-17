package top.xudj.mp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import top.xudj.mp.model.User;
import top.xudj.mp.model.UserDto;
import top.xudj.mp.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findById")
    public User findById (@RequestParam("id") Integer id) {
        return userService.getById(id);
    }

    @RequestMapping("/queryPageDto")
    public IPage<UserDto> queryPageDto () {
        IPage<UserDto> userList = userService.queryPageDto();
        return userList;
    }

    @RequestMapping("/queryPage")
    public IPage<User> queryPage () {
        IPage<User> userList = userService.queryPage();
        return userList;
    }

    @RequestMapping("/getByName")
    public List<User> getByName () {
//        QueryWrapper queryWrapper = new QueryWrapper();
//        queryWrapper.eq("name", "Jack");
//        List<User> userList = userMapper.selectList(queryWrapper);

        List<User> userList = userService.findUserByName("Jack");
        userList.forEach(System.out::println);
        return userList;
    }

    @RequestMapping("/add")
    public String add () {
        User user = new User();
        user.setName("haha");
        user.setAge(1);
        user.setEmail("it_x@126.com");
        userService.save(user);
        return "成功";
    }

}
