package com.gmail.iikaliada.test.work.service.converter;

import com.gmail.iikaliada.test.work.repository.model.User;
import com.gmail.iikaliada.test.work.service.model.LoginDTO;

public interface UserConverter {
    LoginDTO fromUser(User user);

    User toUser(LoginDTO loginDTO);
}
