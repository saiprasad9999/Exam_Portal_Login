package com.example.demo.serviceImpl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.model.UserRole;
import com.example.demo.repository.RoleRepo;
import com.example.demo.repository.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userrepo;
	@Autowired
	private RoleRepo rolerepo;

	// creating user
	@Override
	public User createUser(User user, Set<UserRole> userRole) throws Exception {

		User local = userrepo.findByUserName(user.getUserName());
		if (local != null) {
			System.out.println("User already Present");
			throw new Exception("User already Present");
		} else {
			for (UserRole ur : userRole) {
				rolerepo.save(ur.getRole());
			}
			user.getUserRole().addAll(userRole);
			local = this.userrepo.save(user);
		}

		return local;
	}

	@Override
	public User getUser(String Username) {
		User user = this.userrepo.findByUserName(Username);

		return user;
	}

	@Override
	public void deleteUser(Long id) {
		this.userrepo.deleteById(id);
	}

	@Override
	public User updateUser(User user) {

		return this.userrepo.save(user);
	}

}
