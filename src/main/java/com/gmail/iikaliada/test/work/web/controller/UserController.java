package com.gmail.iikaliada.test.work.web.controller;

import com.gmail.iikaliada.test.work.service.UserService;
import com.gmail.iikaliada.test.work.service.model.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public String placeUser(@RequestBody LoginDTO user) {
        userService.addUser(user);
        return "redirect:/login";
    }
}
