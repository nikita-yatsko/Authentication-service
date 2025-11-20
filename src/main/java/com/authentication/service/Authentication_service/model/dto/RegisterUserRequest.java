package com.authentication.service.Authentication_service.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRequest {

    @NotNull
    private Integer userId;

    @Size(min = 3, max = 30, message = "Username should be between 3 and 30")
    private String username;

    private String password;
}
