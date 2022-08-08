package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.UserRole;
import com.example.demo.service.UserService;

@SpringBootApplication
public class ExamPortalApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamPortalApplication.class, args);
		System.out.println("starting");
	}

	@Override
	public void run(String... args) throws Exception {
		
		//setting user details
		/*
		 * User user1=new User(); user1.setEmail("sai@123"); user1.setFirstName("Sai");
		 * user1.setLastName("Raktate"); user1.setPassword("123");
		 * user1.setPhone("8412999852"); user1.setProfile("profile.png");
		 * user1.setUserName("SaiRaktate");
		 * 
		 * //setting role details Role role1=new Role(); role1.setRoleId(1);
		 * role1.setRoleName("Admin");
		 * 
		 * //setting user and role in userrole UserRole userrole=new UserRole();
		 * userrole.setRole(role1); userrole.setUser(user1);
		 * 
		 * //setting userrole in userroleSet Set<UserRole> userroleSet=new HashSet<> ();
		 * userroleSet.add(userrole);
		 * 
		 * User firstuser=this.userService.createUser(user1, userroleSet);
		 * System.out.println(firstuser.getUserName());
		 */
		
		
	}

}
