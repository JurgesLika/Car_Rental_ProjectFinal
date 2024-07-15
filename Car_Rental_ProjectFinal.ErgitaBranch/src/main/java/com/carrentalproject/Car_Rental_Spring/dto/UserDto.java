package com.carrentalproject.Car_Rental_Spring.dto;

import com.carrentalproject.Car_Rental_Spring.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private String email;
    private UserRole userRole;



}
