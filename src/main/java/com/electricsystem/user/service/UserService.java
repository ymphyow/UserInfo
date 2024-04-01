package com.electricsystem.user.service;

import com.electricsystem.user.model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.electricsystem.user.repository.UserRepository;
import com.electricsystem.user.model.entity.User;
import java.util.List;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

    public List<User> getUsersBySurname(String surname) {
        return userRepository.findBySurname(surname);
    }
    public User saveDetails(UserDTO userDTO) {
        User user = new User();
        user.setSurname(userDTO.getSurname());
        user.setFirstname(userDTO.getFirstname());
        user.setEmail(userDTO.getEmail());
        return userRepository.save(user);
    }
    public  List<User> getAllUserDetails(){
        return userRepository.findAll();

    }
   
}
