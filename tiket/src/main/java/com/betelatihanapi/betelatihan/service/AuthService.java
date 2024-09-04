package com.betelatihanapi.betelatihan.service;

import com.betelatihanapi.betelatihan.models.entities.Auth;

public interface AuthService {

    // Metode untuk login pengguna
    Auth loginUser(String email, String password);

    // Metode untuk logout pengguna
    void logoutUser(String userId);
}
