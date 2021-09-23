package com.example.spring_boot_jwt_btn.service;

import com.example.spring_boot_jwt_btn.entity.Token;
import com.example.spring_boot_jwt_btn.repository.TokenRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TokenServiceImpl implements TokenService{
    @Autowired
    private TokenRepository tokenRepository;

    public Token createToken(Token token) {
        return tokenRepository.saveAndFlush(token);
    }

    @Override
    public Token findByToken(String token) {
        return tokenRepository.findByToken(token);
    }
}
