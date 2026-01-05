package com.authentication.service.Authentication_service.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class AuthResponse {

    private boolean valid;
    private Long userId;
    private String role;
    private String username;
}
