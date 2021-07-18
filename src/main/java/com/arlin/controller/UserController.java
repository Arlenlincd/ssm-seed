package com.arlin.controller;

import com.arlin.domain.User;
import com.arlin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @Author: arlin
 * @Date: 2021/7/18
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }
}
