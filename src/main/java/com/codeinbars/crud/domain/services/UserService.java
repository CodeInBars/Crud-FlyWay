package com.codeinbars.crud.domain.services;

import com.codeinbars.crud.infraestructure.entity.UsersEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<UsersEntity> findAllUsers();
}
