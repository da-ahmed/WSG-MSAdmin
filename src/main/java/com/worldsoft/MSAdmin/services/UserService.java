package com.worldsoft.MSAdmin.services;



import com.worldsoft.MSAdmin.dao.UserRepository;
import com.worldsoft.MSAdmin.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** 
 * @author kamal berriga
 *
 */
@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public User save(User user) {
		return userRepository.saveAndFlush(user);
	}

	public User update(User user) {
		return userRepository.save(user);
	}

	public User find(String userName) {
		return userRepository.findOneByUsername(userName);
	}

	public User find(Long id) {
		return userRepository.findById(id).get();
	}
}
