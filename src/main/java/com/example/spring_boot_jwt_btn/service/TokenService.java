package com.example.spring_boot_jwt_btn.service;

import com.example.spring_boot_jwt_btn.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
