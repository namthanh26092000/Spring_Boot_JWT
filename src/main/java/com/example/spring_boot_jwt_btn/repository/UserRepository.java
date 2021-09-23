package com.example.spring_boot_jwt_btn.repository;

import com.example.spring_boot_jwt_btn.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
