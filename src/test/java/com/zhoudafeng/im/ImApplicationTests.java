package com.zhoudafeng.im;

import com.zhoudafeng.im.pojo.vo.LoginToken;
import com.zhoudafeng.im.utils.ApiResult;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Map;

@SpringBootTest
class ImApplicationTests {

    @Test
    void contextLoads() {
        int index = 100;
        System.out.println("1~"+index+"的和:"+this.oneToNSum(100));
        ApiResult apiResult = ApiResult.requestSuccess().data("user", new  LoginToken());
        System.out.println(apiResult.toString());
    }

    int oneToNSum(int number){
        if(number == 1){
            return 1;
        }else {
            return oneToNSum(number - 1)+number;
        }
    }
}
