package com.authentication.service.Authentication_service.service;

import com.authentication.service.Authentication_service.model.dto.AuthResponse;
import com.authentication.service.Authentication_service.model.dto.LoginRequest;
import com.authentication.service.Authentication_service.model.dto.RegisterUserRequest;
import com.authentication.service.Authentication_service.model.dto.TokenPair;
import com.authentication.service.Authentication_service.model.entity.AuthUser;

public interface AuthService {

    AuthUser registerUser(RegisterUserRequest request);

    TokenPair login(LoginRequest request);

    TokenPair refreshToken(String refreshToken);

    AuthResponse validateToken(String token);
}
