package com.worldsoft.MSAdmin;

import com.worldsoft.MSAdmin.dao.RoleDAO;
import com.worldsoft.MSAdmin.entities.Role;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MsAdminApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MsAdminApplication.class, args);
                
                RoleDAO roleDao = context.getBean(RoleDAO.class);
                
                Role roleUser = new Role();
            Role roleAdmin = new Role();
            roleUser.setRoleName("STANDARD_USER");
            roleUser.setDescription("Standard User - N'a pas de droits admin");
            roleDao.save(roleUser);
            roleAdmin.setRoleName("ADMIN_USER");
            roleAdmin.setDescription("Admin User - Il a les permissions d'effectuer les taches d'un admin");
            roleDao.save(roleAdmin);
	}
}
