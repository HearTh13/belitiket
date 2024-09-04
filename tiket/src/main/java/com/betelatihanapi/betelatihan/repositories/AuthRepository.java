package com.betelatihanapi.betelatihan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betelatihanapi.betelatihan.models.entities.Auth;

@Repository
public interface AuthRepository extends JpaRepository<Auth, String> {
    
    // Metode untuk menemukan auth berdasarkan user_id
    Auth findByUserId(String userId);
}
