package com.zhoudafeng.im;

import com.zhoudafeng.im.service.UserService;
import com.zhoudafeng.im.service.impl.UserServiceImpl;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@MapperScan(value = "com.zhoudafeng.im.mapper")
class ImApplicationTests {
    private static Logger logger;
    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
//        logger.info("查询数据为:{}",userService.queryAll());
        System.out.println(userService.queryAll().toString());
    }
}
