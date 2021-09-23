package com.example.spring_boot_jwt_btn.controller;

import com.example.spring_boot_jwt_btn.authen.UserPrincipal;
import com.example.spring_boot_jwt_btn.entity.Token;
import com.example.spring_boot_jwt_btn.entity.User;
import com.example.spring_boot_jwt_btn.service.TokenService;
import com.example.spring_boot_jwt_btn.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class AuthController {



    private UserService userService;
    @PostMapping("/register")
    public User register(@RequestBody User user){
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userService.createUser(user);
    }
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestBody User user){
//
//        UserPrincipal userPrincipal =
//                userService.findByUsername(user.getUsername());
//
//        if (null == user || !new BCryptPasswordEncoder()
//                .matches(user.getPassword(), userPrincipal.getPassword())) {
//
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
//                    .body("Account or password is not valid!");
//        }
//
//        Token token = new Token();
//        token.setToken(jwtUtil.generateToken(userPrincipal));
//
//        token.setTokenExpDate(jwtUtil.generateExpirationDate());
//        token.setCreatedBy(userPrincipal.getUserId());
//        tokenService.createToken(token);
//
//        return ResponseEntity.ok(token.getToken());



}
