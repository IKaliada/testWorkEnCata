package com.gmail.iikaliada.test.work.service;

import com.gmail.iikaliada.test.work.repository.model.User;
import com.gmail.iikaliada.test.work.service.model.LoginDTO;

public interface UserService {
    LoginDTO getUserByName(String name);

    void addUser(LoginDTO user);
}
