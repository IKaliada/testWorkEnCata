package com.gmail.iikaliada.test.work.service.impl;

import com.gmail.iikaliada.test.work.service.UserService;
import com.gmail.iikaliada.test.work.service.model.AppUserPrincipal;
import com.gmail.iikaliada.test.work.service.model.LoginDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AppUserDetailsService implements UserDetailsService {
    private final UserService userService;
    private final static String USERNAME_EXCEPTION_MESSAGE = "User is not found";

    public AppUserDetailsService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String name) {
        LoginDTO userDTO = userService.getUserByName(name);

        if (userDTO == null) {
            throw new UsernameNotFoundException(USERNAME_EXCEPTION_MESSAGE);
        }
        return new AppUserPrincipal(userDTO);
    }
}
