package com.betelatihanapi.betelatihan.controllers;

import com.betelatihanapi.betelatihan.models.dto.RegistrationRequest;
import com.betelatihanapi.betelatihan.models.entities.User;
import com.betelatihanapi.betelatihan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(path = "/registrasi")
    public ResponseEntity<Map<String, String>> registerUser(@RequestBody RegistrationRequest registrationRequest) {
        try {
            User registeredUser = userService.registerUser(registrationRequest);
            Map<String, String> response = new HashMap<>();
            response.put("code", "201 Created");
            response.put("userId", registeredUser.getUserId());
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        } catch (RuntimeException e) {
            Map<String, String> response = new HashMap<>();
            response.put("error", e.getMessage());
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }



    // @PostMapping(path = "/validasi-otp")
    // public ResponseEntity<Map<String, String>> validasi(@RequestBody User user) {
    //     Map<String, String> response = new HashMap<>();
    //     try {
    //         userService.registerUser(user);
    //         response.put("code", "201 Created");
    //         return new ResponseEntity<>(response, HttpStatus.CREATED);
    //     } catch (RuntimeException e) {
    //         response.put("error", e.getMessage());
    //         return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    //     }
    // }

    // Endpoint untuk mendapatkan pengguna berdasarkan email
    @GetMapping(path = "/find")
    public ResponseEntity<User> findUserByEmail(@RequestParam String email) {
        User user = userService.findUserByEmail(email);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
        }
    }
}
