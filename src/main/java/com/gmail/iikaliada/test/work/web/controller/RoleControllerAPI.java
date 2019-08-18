package com.gmail.iikaliada.test.work.web.controller;

import com.gmail.iikaliada.test.work.service.RoleService;
import com.gmail.iikaliada.test.work.service.model.RoleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RoleControllerAPI {

    private final RoleService roleService;

    @Autowired
    public RoleControllerAPI(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping("/role")
    public ResponseEntity<String> addRole(@RequestBody RoleDTO roleDTO) {
        roleService.add(roleDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
