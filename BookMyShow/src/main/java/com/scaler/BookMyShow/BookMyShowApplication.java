package com.scaler.BookMyShow;

import com.scaler.BookMyShow.controller.UserController;
import com.scaler.BookMyShow.dto.SignUpRequestDto;
import com.scaler.BookMyShow.dto.SignUpResponseDto;
import com.scaler.BookMyShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;

	@Autowired
	private UserService userService;

	public static void main(String[] args) {

		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SignUpRequestDto request = new SignUpRequestDto();
		request.setEmail("abc1@gmail.com");
		request.setName("Virat");
		request.setMobileNo("1233424");
		request.setPassword("virat123");

		SignUpResponseDto response = userController.signUp(request);
		System.out.println(response.getResponseStatus());
		System.out.println(response.getUserId());

		System.out.println(userService.login("abc1@gmail.com","virasft123"));
	}
}
