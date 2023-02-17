package top.xudj.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("top.xudj.mp.mapper")
@SpringBootApplication
public class MybatisPlusExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusExampleApplication.class, args);
    }

}
