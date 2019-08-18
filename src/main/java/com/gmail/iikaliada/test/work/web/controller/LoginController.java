package com.gmail.iikaliada.test.work.web.controller;

import com.gmail.iikaliada.test.work.service.model.LoginDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String loginUser(LoginDTO loginDTO, Model model) {
        model.addAttribute("loginDTO", loginDTO);
        return "login";
    }

    @GetMapping("/admin")
    public String getAdminPage() {
        return "admin";
    }

    @GetMapping("/user")
    public String getUserPage() {
        return "user";
    }
}
