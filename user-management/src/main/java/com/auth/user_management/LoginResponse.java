package com.auth.user_management;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
private String token;

    private long expiresIn;

    public String getToken() {
        return token;
    }

   
}
