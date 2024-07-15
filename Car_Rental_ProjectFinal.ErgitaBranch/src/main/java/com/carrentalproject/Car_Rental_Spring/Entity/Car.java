package com.carrentalproject.Car_Rental_Spring.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;


@Data
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String brand;

    private String type;

    private String transmission;

    private String description;

    private Long Price;

    private Date year;

    @Column(columnDefinition = "longblob")
    private byte[] image;

}
