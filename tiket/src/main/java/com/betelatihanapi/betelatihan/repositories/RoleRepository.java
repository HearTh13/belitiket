package com.betelatihanapi.betelatihan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betelatihanapi.betelatihan.models.entities.Roles;

@Repository
public interface RoleRepository extends JpaRepository<Roles, Long> {
    
    
}
