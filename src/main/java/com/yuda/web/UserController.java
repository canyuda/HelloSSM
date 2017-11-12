package com.yuda.web;

import com.yuda.entity.User;
import com.yuda.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @auther yuda
 * Create on 2017/11/12 22:11.
 * Project_name :   HelloSSM
 * Package_name :   com.yuda.web
 * Description  :   TODO
 */
@Controller
@RequestMapping(value = "/hello")
public class UserController {

    private final Logger loggger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/mvc",method = RequestMethod.POST)
    public String test1(User user, Model model) {
        loggger.debug("正在保存 : " + user);
        userService.insertSelective(user);
        model.addAttribute(user);
        return "user";
    }
}
