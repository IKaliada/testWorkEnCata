package com.gmail.iikaliada.test.work.service.converter.impl;

import com.gmail.iikaliada.test.work.repository.model.User;
import com.gmail.iikaliada.test.work.service.converter.RoleConverter;
import com.gmail.iikaliada.test.work.service.converter.UserConverter;
import com.gmail.iikaliada.test.work.service.model.LoginDTO;
import org.springframework.stereotype.Component;

@Component
public class UserConverterImpl implements UserConverter {
    private final RoleConverter roleConverter;

    public UserConverterImpl(RoleConverter roleConverter) {
        this.roleConverter = roleConverter;
    }

    @Override
    public LoginDTO fromUser(User user) {
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setId(user.getId());
        loginDTO.setName(user.getName());
        loginDTO.setPassword(user.getPassword());
        loginDTO.setRoleDTO(roleConverter.fromRole(user.getRole()));
        return loginDTO;
    }

    @Override
    public User toUser(LoginDTO loginDTO) {
        User user = new User();
        user.setId(loginDTO.getId());
        user.setName(loginDTO.getName());
        user.setPassword(loginDTO.getPassword());
        user.setRole(roleConverter.toRole(loginDTO.getRoleDTO()));
        return user;
    }
}
