package com.carrentalproject.Car_Rental_Spring.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
public class CarDto {
    private Long id;

    private String name;

    private String brand;

    private String type;

    private String transmission;

    private String description;

    private Long Price;

    private Date year;

    private MultipartFile image;

    private byte[] returnedImage;
}
