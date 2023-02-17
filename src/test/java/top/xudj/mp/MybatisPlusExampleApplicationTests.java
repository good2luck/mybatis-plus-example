package top.xudj.mp;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import top.xudj.mp.mapper.OrderMapper;
import top.xudj.mp.model.Orders;
import top.xudj.mp.model.User;
import top.xudj.mp.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class MybatisPlusExampleApplicationTests {

    @Resource
    private UserService userService;

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void testFind() {
        Wrapper queryWrapper = new LambdaQueryWrapper<User>()
                .eq(User::getName, "Jack");
        List<User> users = userService.list(queryWrapper);
        System.out.println(users);

        Wrapper queryWrapper2 = new LambdaQueryWrapper<Orders>()
                .eq(Orders::getName, "订单");
        List<Orders> orders = orderMapper.selectList(queryWrapper2);
        System.out.println(orders);
    }


    @Test
    public void testSelect() {
        List<User> userList = userService.list(new QueryWrapper<>());
        System.out.println(userList);
    }



}
