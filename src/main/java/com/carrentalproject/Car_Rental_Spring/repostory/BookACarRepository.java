package com.carrentalproject.Car_Rental_Spring.repostory;

import com.carrentalproject.Car_Rental_Spring.entity.BookACar;
import com.carrentalproject.Car_Rental_Spring.dto.BookACarDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookACarRepository extends JpaRepository<BookACar,Long> {
    List<BookACar> findAllByUserId(Long userId);
}
