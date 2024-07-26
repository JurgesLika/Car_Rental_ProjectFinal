package com.carrentalproject.Car_Rental_Spring.repostory;

import com.carrentalproject.Car_Rental_Spring.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
