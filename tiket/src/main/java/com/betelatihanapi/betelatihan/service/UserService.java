package com.betelatihanapi.betelatihan.service;

import com.betelatihanapi.betelatihan.models.dto.RegistrationRequest;
import com.betelatihanapi.betelatihan.models.entities.User;

public interface UserService {
    
    // Ubah metode ini untuk menerima RegistrationRequest
    User registerUser(RegistrationRequest registrationRequest);
    
    // Metode untuk mendapatkan pengguna berdasarkan email
    User findUserByEmail(String email);
}
