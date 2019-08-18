package com.gmail.iikaliada.test.work.service.converter;

import com.gmail.iikaliada.test.work.repository.model.Role;
import com.gmail.iikaliada.test.work.service.model.RoleDTO;

public interface RoleConverter {
    RoleDTO fromRole(Role role);

    Role toRole(RoleDTO roleDTO);
}
