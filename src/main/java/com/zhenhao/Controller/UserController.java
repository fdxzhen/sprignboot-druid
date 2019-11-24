package com.zhenhao.Controller;

import com.zhenhao.bean.User;
import com.zhenhao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController  {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/{id}")
    public User list(@PathVariable int id) {
        return userService.findById(id);
    }
}

