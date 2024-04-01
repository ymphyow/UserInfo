package com.electricsystem.user;

import com.electricsystem.user.model.entity.User;
import com.electricsystem.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserInfoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(UserInfoApplication.class, args);
    }

    @Autowired
    UserRepository userRepository;

   @Override
    public void run(String... args) throws Exception {
        if (userRepository.findAll().isEmpty()) {
            User user = new User();
            user.setFirstname("Mon");
            user.setSurname("Phyow");
            user.setEmail("ymphyow@hotmail.com");
            userRepository.save(user);
        }
    }
}
