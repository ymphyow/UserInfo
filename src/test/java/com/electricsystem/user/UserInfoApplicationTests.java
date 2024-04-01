package com.electricsystem.user;

import com.electricsystem.user.controller.UserController;
import com.electricsystem.user.model.dto.UserDTO;
import com.electricsystem.user.model.entity.User;
import com.electricsystem.user.repository.UserRepository;
import com.electricsystem.user.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class UserInfoApplicationTests {

	@Autowired
	 UserRepository userRepository;

	@Test
	public void testCreate(){
		User user = new User();
		user.setFirstname("Fay");
		user.setSurname("Jenner");
		user.setEmail("fay.jenner@gmail.com");
		userRepository.save(user);
	}

	@Test
	public void testGetAllUsers(){
		List<User> list =userRepository.findAll();
		assertThat(list).size().isGreaterThan(0);

	}
}
