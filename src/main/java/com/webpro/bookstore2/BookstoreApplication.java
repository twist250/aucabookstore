package com.webpro.bookstore2;

import java.util.HashSet;
import java.util.Set;

import com.webpro.bookstore2.domain.User;
import com.webpro.bookstore2.domain.security.Role;
import com.webpro.bookstore2.domain.security.UserRole;
import com.webpro.bookstore2.service.UserService;
import com.webpro.bookstore2.utility.SecurityUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		/*User user1 = new User();
		user1.setFirstName("IRADUKUNDA");
		user1.setLastName("Olivier");
		user1.setUsername("twist250");
		user1.setPassword(SecurityUtility.passwordEncoder().encode("password"));
		user1.setEmail("irpezzi01@gmail.com");
		Set<UserRole> userRoles = new HashSet<>();
		Role role1= new Role();
		role1.setRoleId(1);
		role1.setName("ROLE_USER");
		userRoles.add(new UserRole(user1, role1));
		
		userService.createUser(user1, userRoles);*/
	}
}
