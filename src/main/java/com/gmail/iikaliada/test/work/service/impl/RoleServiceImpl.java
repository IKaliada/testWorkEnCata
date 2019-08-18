package com.gmail.iikaliada.test.work.service.impl;

import com.gmail.iikaliada.test.work.repository.RoleRepository;
import com.gmail.iikaliada.test.work.repository.model.Role;
import com.gmail.iikaliada.test.work.service.RoleService;
import com.gmail.iikaliada.test.work.service.converter.RoleConverter;
import com.gmail.iikaliada.test.work.service.model.RoleDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleConverter roleConverter;

    public RoleServiceImpl(RoleRepository roleRepository, RoleConverter roleConverter) {
        this.roleRepository = roleRepository;
        this.roleConverter = roleConverter;
    }

    @Override
    @Transactional
    public void add(RoleDTO roleDTO) {
        Role role = roleConverter.toRole(roleDTO);
        roleRepository.save(role);
    }
}
