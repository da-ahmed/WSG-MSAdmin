 package com.worldsoft.MSAdmin.dao;

import com.worldsoft.MSAdmin.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/** 
 * @author kamal berriga
 *
 */
/* this the user  Repository interface  */ 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

public User findOneByUsername(String username);
}
