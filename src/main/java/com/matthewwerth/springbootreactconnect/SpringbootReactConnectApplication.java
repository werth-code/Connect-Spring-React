package com.matthewwerth.springbootreactconnect;

import com.matthewwerth.springbootreactconnect.model.User;
import com.matthewwerth.springbootreactconnect.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootReactConnectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactConnectApplication.class, args);
	}

	@Autowired
	private UserRepo userRepo;

	@Override
	public void run(String... args) throws Exception {
		userRepo.save(new User("Matt", "Werth", "matthewwerth@gmail.com"));
		userRepo.save(new User("Laurie", "Werth", "matthewwerth@gmail.com"));
		userRepo.save(new User("Henry", "Werth", "matthewwerth@gmail.com"));

	}
}
