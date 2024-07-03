package com.lxisoft.demo.repository ;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
        User findByUsername(String username) ;
    

}
