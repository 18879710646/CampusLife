package com.org.Controller;

import com.org.POJO.User;
import com.org.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author HP
 * @Date 2021/12/11 11:41
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */

@RestController
@RequestMapping("/Test")
public class TestController {
    @Autowired
    private UserService userService;
    @RequestMapping("/a")
    public List<User> findAll(){
        return userService.findAll();
    }
}
