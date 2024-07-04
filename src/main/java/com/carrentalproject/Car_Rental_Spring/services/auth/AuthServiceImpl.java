package com.carrentalproject.Car_Rental_Spring.services.auth;

import com.carrentalproject.Car_Rental_Spring.dto.SignupRequest;
import com.carrentalproject.Car_Rental_Spring.dto.UserDto;
import com.carrentalproject.Car_Rental_Spring.Entity.User;
import com.carrentalproject.Car_Rental_Spring.enums.UserRole;
import com.carrentalproject.Car_Rental_Spring.repostory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        User user = new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(new BCryptPasswordEncoder().encode(signupRequest.getPassword()));
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser= userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());

        return userDto;
    }

    @Override
    public boolean hasCustomerWithEmail(String email) {

        return  userRepository.findFirstByEmail(email).isPresent();
    }
}

