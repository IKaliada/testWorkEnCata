package com.gmail.iikaliada.test.work.service.impl;

import com.gmail.iikaliada.test.work.repository.UserRepository;
import com.gmail.iikaliada.test.work.repository.model.User;
import com.gmail.iikaliada.test.work.service.UserService;
import com.gmail.iikaliada.test.work.service.converter.UserConverter;
import com.gmail.iikaliada.test.work.service.model.LoginDTO;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserConverter userConverter;

    public UserServiceImpl(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    @Override
    @Transactional
    public LoginDTO getUserByName(String name) {
        User user = userRepository.findByName(name);
        return userConverter.fromUser(user);
    }

    @Override
    @Transactional
    public void addUser(LoginDTO loginDTO) {
        User user = userConverter.toUser(loginDTO);
        user.setPassword(new BCryptPasswordEncoder().encode(loginDTO.getPassword()));
        userRepository.save(user);
    }
}
