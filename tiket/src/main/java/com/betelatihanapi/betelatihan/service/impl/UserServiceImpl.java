package com.betelatihanapi.betelatihan.service.impl;

import com.betelatihanapi.betelatihan.models.dto.RegistrationRequest;
import com.betelatihanapi.betelatihan.models.entities.Auth;
import com.betelatihanapi.betelatihan.models.entities.User;
import com.betelatihanapi.betelatihan.repositories.AuthRepository;
import com.betelatihanapi.betelatihan.repositories.UserRepository;
import com.betelatihanapi.betelatihan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthRepository authRepository;

    @Override
    public User registerUser(RegistrationRequest registrationRequest) {
        if (userRepository.findByEmail(registrationRequest.getEmail()) != null) {
            throw new RuntimeException("Email sudah terdaftar!");
        }
    
        // Buat objek User baru
        User user = new User();
        user.setUserId(UUID.randomUUID().toString());
        user.setFullname(registrationRequest.getFullname());
        user.setEmail(registrationRequest.getEmail());
        user.setBirthdate(LocalDate.parse(registrationRequest.getBirthdate()));
        user.setPhonenumber(registrationRequest.getPhonenumber());
        user.setRoleId(registrationRequest.getRoleId());
    
        // Simpan User terlebih dahulu
        User savedUser = userRepository.save(user);
    
        // Buat objek Auth baru dan set ID sama dengan User
        Auth auth = new Auth();
        auth.setUser(savedUser);  // Ini akan otomatis set userId pada 'Auth'
        auth.setPassword(registrationRequest.getPassword());
        
        // Simpan Auth
        authRepository.save(auth);
    
        return savedUser;
    }
    

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
