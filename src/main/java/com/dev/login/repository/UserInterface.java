package com.dev.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.login.module.User;

public interface UserInterface extends JpaRepository<User, String>{

}
