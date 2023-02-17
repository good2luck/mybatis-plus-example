//package top.xudj.mp.config;
//
//import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;
//import org.springframework.context.annotation.Import;
//import top.xudj.mp.service.UserService;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//
//@Component
//public class IdGenerator implements IdentifierGenerator {
//
//    @Resource
//    @Lazy
//    private UserService userService;
//
//    @Override
//    public Number nextId(Object entity) {
//        Long idNext = userService.getIdNext();
////        if (idNext % 2 == 0) {
////            throw new RuntimeException("模拟异常");
////        }
//        return idNext;
//    }
//}
