package com.betelatihanapi.betelatihan.controllers;

// import com.betelatihanapi.betelatihan.models.entities.Auth;
// import com.betelatihanapi.betelatihan.service.AuthService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;

// @RestController
// // @RequestMapping("/api/auth")
// public class AuthController {

//     @Autowired
//     private AuthService authService;

//     // Endpoint untuk login
//     @PostMapping(path = "/login")
//     public ResponseEntity<Auth> loginUser(@RequestParam String email, @RequestParam String password) {
//         try {
//             Auth auth = authService.loginUser(email, password);
//             return new ResponseEntity<>(auth, HttpStatus.OK);
//         } catch (RuntimeException e) {
//             return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
//         }
//     }

//     // Endpoint untuk logout
//     @PostMapping(path = "/logout")
//     public ResponseEntity<Void> logoutUser(@RequestParam String userId) {
//         authService.logoutUser(userId);
//         return new ResponseEntity<>(HttpStatus.OK);
//     }
// }
