package com.example.spring_boot_jwt_btn.service;

import com.example.spring_boot_jwt_btn.authen.UserPrincipal;
import com.example.spring_boot_jwt_btn.entity.User;
import com.example.spring_boot_jwt_btn.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
