package com.carrentalproject.Car_Rental_Spring.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;
    private String password;
}
