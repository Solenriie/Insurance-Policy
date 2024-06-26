package com.example.backend.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequestDTO {

    @NotEmpty(message = "field email cannot be empty")
    private String email;

    @NotEmpty(message = "field password cannot be empty")
    private String password;
}
