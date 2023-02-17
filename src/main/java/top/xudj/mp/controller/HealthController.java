package top.xudj.mp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 健康检查接口
 *
 * @author kz
 * @since
 */
@RestController
public class HealthController {

    @GetMapping("/health")
    public String health () {
        return "ok";
    }

}
