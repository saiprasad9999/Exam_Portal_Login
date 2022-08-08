package com.example.demo.service;
import java.util.Set;

import com.example.demo.model.*;
public interface UserService {
	
	public User createUser(User user,Set<UserRole> userRole) throws Exception;
	public User getUser(String Username);
	public void deleteUser(Long id);
	public User updateUser(User user);
	

}
