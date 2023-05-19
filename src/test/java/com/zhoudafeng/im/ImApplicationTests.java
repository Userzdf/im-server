package com.zhoudafeng.im;

import com.zhoudafeng.im.service.UserService;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ImApplicationTests {
    private static Logger logger;
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        System.out.println(userService.queryAll().toString());
    }
}
