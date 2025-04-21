package com.easybooking.oauth_service.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
