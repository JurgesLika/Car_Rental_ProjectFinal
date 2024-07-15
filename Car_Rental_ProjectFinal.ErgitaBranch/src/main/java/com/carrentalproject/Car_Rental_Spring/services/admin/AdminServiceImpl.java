package com.carrentalproject.Car_Rental_Spring.services.admin;

import com.carrentalproject.Car_Rental_Spring.dto.CarDto;
import com.carrentalproject.Car_Rental_Spring.entity.Car;
import com.carrentalproject.Car_Rental_Spring.repostory.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{

    private final CarRepository carRepository;

    @Override
    public boolean postCar(CarDto carDto) throws IOException {
        try {
            Car car = new Car();
            car.setName(carDto.getName());
            car.setBrand(carDto.getBrand());
            car.setType(carDto.getType());
            car.setPrice(carDto.getPrice());
            car.setYear(carDto.getYear());
            car.setDescription(carDto.getDescription());
            car.setTransmission(carDto.getTransmission());
            car.setImage(carDto.getImage().getBytes());
            carRepository.save(car);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
