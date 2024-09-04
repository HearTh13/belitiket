package com.betelatihanapi.betelatihan.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.betelatihanapi.betelatihan.models.entities.User;

import java.util.List;
// import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findByFullname(String fullname);
    
    User findByEmail(String email);
} 