package com.codeinbars.crud.infraestructure.repository;

import com.codeinbars.crud.infraestructure.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UsersEntity, Long> {

    @Query("SELECT id, name, age FROM UsersEntity")
    List<UsersEntity> findAllUsers();

}
