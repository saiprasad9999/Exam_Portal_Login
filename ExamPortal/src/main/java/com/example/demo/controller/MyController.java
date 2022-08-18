package com.example.demo.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.model.UserRole;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class MyController {
	@Autowired
	private UserService userservice;

//	1. To create new user
//testing git

	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		Role role = new Role();
		role.setRoleId(2);
		role.setRoleName("NORMAL");

		UserRole userrole = new UserRole();
		userrole.setRole(role);
		userrole.setUser(user);

		Set<UserRole> userroleset = new HashSet<>();
		userroleset.add(userrole);
		return this.userservice.createUser(user, userroleset);
	}

//	2. Get user data based on username
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName) {

		return this.userservice.getUser(userName);

	}

//	3. Delete user based on ID
	@DeleteMapping("/{id}")
	public String deleteuser(@PathVariable("id") Long id) {
		this.userservice.deleteUser(id);
		return "User deleted Successfully";
	}

//	4.Updating data

	@PostMapping("/update")
	public User update(@RequestBody User user) {
		System.out.println("User updated");
		return this.userservice.updateUser(user);
	}

}
