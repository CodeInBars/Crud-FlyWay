package com.codeinbars.crud.domain.services;

import com.codeinbars.crud.infraestructure.entity.UsersEntity;
import com.codeinbars.crud.infraestructure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<UsersEntity> findAllUsers() {
        return userRepository.findAll();
    }
}
