package com.example.bangiay.controller;

import com.example.bangiay.dto.request.LoginRequest;
import com.example.bangiay.dto.request.SignupRequest;
import com.example.bangiay.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AuthService authService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignupRequest signupRequest){
        return authService.registerKhachHang(signupRequest);
    }

    @PostMapping("/signup/nhan-vien")
    public ResponseEntity<?> signupNhanVien(@RequestBody SignupRequest signupRequest){
        return authService.registerNhanVien(signupRequest);
    }

}
