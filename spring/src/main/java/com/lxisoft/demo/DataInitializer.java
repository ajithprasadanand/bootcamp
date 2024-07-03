package com.lxisoft.demo ;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.lxisoft.demo.model.Role;
import com.lxisoft.demo.model.User;
import com.lxisoft.demo.repository.RoleRepository;
import com.lxisoft.demo.repository.UserRepository;

//@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository ;


    @Autowired
    private RoleRepository roleRepository ;

    
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder() ;

    @Override
    public void run(String... args) throws Exception {
    
            roleRepository.deleteAll(); 
            userRepository.deleteAll(); 

            Role userRole = new Role() ;
            userRole.setName("ROLE_USER");
            roleRepository.save(userRole) ;

            Role adminRole = new Role() ;
            adminRole.setName("ROLE_ADMIN");
            roleRepository.save(adminRole) ;


            User user = new User() ;
            user.setUsername("user");
            user.setPassword(passwordEncoder.encode("password"));
            Set<Role> userRoles = new HashSet() ;
            userRoles.add(userRole) ;
            user.setRoles(userRoles);
            userRepository.save(user) ;


            User admin = new User() ;
            admin.setUsername("admin");
            admin.setPassword(passwordEncoder.encode("password"));
            Set<Role> adminRoles = new HashSet() ;
            adminRoles.add(adminRole) ;
            adminRoles.add(userRole) ;
            admin.setRoles(adminRoles);
            userRepository.save(admin) ;




            



        
    }

    




}
