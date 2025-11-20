package com.authentication.service.Authentication_service.controller;

import com.authentication.service.Authentication_service.model.dto.*;
import com.authentication.service.Authentication_service.model.entity.AuthUser;
import com.authentication.service.Authentication_service.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(
            @RequestBody @Valid RegisterUserRequest registerUserRequest ) {
        AuthUser user = authService.registerUser(registerUserRequest);

        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(
            @RequestBody @Valid LoginRequest loginRequest ) {

        TokenPair tokenPair = authService.login(loginRequest);
        return ResponseEntity.ok().body(tokenPair);
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<TokenPair> refreshToken(
            @RequestBody TokenRequest token) {

        log.info("Request to refresh token");
        TokenPair newTokens = authService.refreshToken(token.getToken());
        log.info("Created new token pair");
        return ResponseEntity.ok(newTokens);
    }

    @PostMapping("/validate")
    public ResponseEntity<AuthResponse> validateToken(
            @RequestBody TokenRequest token) {

        log.info("Request to validate token");
        AuthResponse response = authService.validateToken(token.getToken());
        log.info("Token is valid.");

        return ResponseEntity.ok(response);
    }
}
