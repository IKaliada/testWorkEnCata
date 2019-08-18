package com.gmail.iikaliada.test.work.service.converter.impl;

import com.gmail.iikaliada.test.work.repository.model.Role;
import com.gmail.iikaliada.test.work.service.converter.RoleConverter;
import com.gmail.iikaliada.test.work.service.model.RoleDTO;
import org.springframework.stereotype.Component;

@Component
public class RoleConverterImpl implements RoleConverter {
    @Override
    public RoleDTO fromRole(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role.getId());
        roleDTO.setName(role.getName());
        return roleDTO;
    }

    @Override
    public Role toRole(RoleDTO roleDTO) {
        Role role = new Role();
        role.setId(roleDTO.getId());
        role.setName(roleDTO.getName());
        return role;
    }
}
