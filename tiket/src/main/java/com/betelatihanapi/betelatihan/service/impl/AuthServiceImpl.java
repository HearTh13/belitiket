package com.betelatihanapi.betelatihan.service.impl;

import com.betelatihanapi.betelatihan.models.entities.Auth;
import com.betelatihanapi.betelatihan.models.entities.User;
import com.betelatihanapi.betelatihan.repositories.AuthRepository;
import com.betelatihanapi.betelatihan.repositories.UserRepository;
import com.betelatihanapi.betelatihan.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthRepository authRepository;

    @Override
    public Auth loginUser(String email, String password) {
        // Cari pengguna berdasarkan email
        User user = userRepository.findByEmail(email);
        
        if (user == null) {
            throw new RuntimeException("Email tidak ditemukan!");
        }

        // Cari entitas Auth berdasarkan userId dari pengguna yang ditemukan
        Auth auth = authRepository.findByUserId(user.getUserId());
        
        // Verifikasi password
        if (auth == null || !auth.getPassword().equals(password)) {
            throw new RuntimeException("Password salah!");
        }

        // Tambahkan logika untuk mengatur token dan waktu kadaluarsa di sini
        // auth.setToken(generatedToken);
        // auth.setTokenExpiredAt(expiryTime);

        return authRepository.save(auth);
    }

    @Override
    public void logoutUser(String userId) {
        Auth auth = authRepository.findByUserId(userId);
        if (auth != null) {
            authRepository.delete(auth);
        }
    }
}
