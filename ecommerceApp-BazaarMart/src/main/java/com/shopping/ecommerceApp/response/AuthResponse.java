package com.shopping.ecommerceApp.response;

import com.shopping.ecommerceApp.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
    private String jwt;
    private String message;
    private USER_ROLE role;

}
