package com.lxisoft.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lxisoft.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    

}
