package com.carrentalproject.Car_Rental_Spring.entity;

import com.carrentalproject.Car_Rental_Spring.dto.CarDto;
import jakarta.persistence.*;
import lombok.Data;
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

    private Long price;

    private Date year;

    @Column(columnDefinition = "longblob")
    private byte[] image;

    public CarDto getCarDto(){
        CarDto carDto = new CarDto();
        carDto.setId(id);
        carDto.setName(name);
        carDto.setBrand(brand);
        carDto.setType(type);
        carDto.setTransmission(transmission);
        carDto.setYear(year);
        carDto.setPrice(price);
        carDto.setDescription(description);
        carDto.setReturnedImage(image);
        return carDto;
    }


}