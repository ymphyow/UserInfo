package com.electricsystem.user.controller;
import com.electricsystem.user.model.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.electricsystem.user.model.entity.User;
import com.electricsystem.user.service.UserService;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
    private UserService userService;

	/* Retrieving the User's Details by Surname */
    @GetMapping("/users/{surname}")
    public ResponseEntity<List<User>> getUsersBySurname(@PathVariable String surname) {
        List<User> users = userService.getUsersBySurname(surname);
        return ResponseEntity.ok(users);
    }

    /* Creating the User's Details */
    @PostMapping("/addUser")
    public ResponseEntity<User> addUserDetails(@RequestBody UserDTO userDTO)
    {
        User user = userService.saveDetails(userDTO);
        return ResponseEntity.ok(user);
    }

    /* Retrieving All User's Details */
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUserDetails(){
        List<User> user = userService.getAllUserDetails();
        return ResponseEntity.ok(user);
    }
   
}
