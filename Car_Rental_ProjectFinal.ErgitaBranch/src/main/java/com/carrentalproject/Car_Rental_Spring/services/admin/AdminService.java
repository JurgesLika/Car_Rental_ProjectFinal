package com.carrentalproject.Car_Rental_Spring.services.admin;

import com.carrentalproject.Car_Rental_Spring.dto.CarDto;

import java.io.IOException;

public interface AdminService {
    boolean postCar(CarDto carDto) throws IOException;
}
