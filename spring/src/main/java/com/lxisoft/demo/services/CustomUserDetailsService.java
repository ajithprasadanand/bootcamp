package com.lxisoft.demo.services;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.configurers.userdetails.UserDetailsServiceConfigurer;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lxisoft.demo.model.User;
import com.lxisoft.demo.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository ;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Inside credential loader");
        User user = userRepository.findByUsername(username) ;
        System.out.println(user);
        if ( user == null) {
            throw new UsernameNotFoundException("User Not Found") ;
        }

        return new  org.springframework.security.core.userdetails.User(user.getUsername(), 
        user.getPassword(), 
        user.getRoles().stream().map( (role) -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList())

        ) ;
        
        
        
    }

    

    
}
