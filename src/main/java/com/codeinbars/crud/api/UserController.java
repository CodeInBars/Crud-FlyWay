package com.codeinbars.crud.api;

import com.codeinbars.crud.domain.services.UserService;
import com.codeinbars.crud.infraestructure.entity.UsersEntity;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/findAll")
    public List<UsersEntity> findAllUsers(){
        return userService.findAllUsers();
    }
}
