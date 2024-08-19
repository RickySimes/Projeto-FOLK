package com.folkazores.folk_azores.Controller;

import com.folkazores.folk_azores.model.User;
import com.folkazores.folk_azores.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Value("${app.secret-keyword}")
    private String secretKeyword;

    @PostMapping("/api/register")
    public ResponseEntity<?> registerUser(@RequestBody Map<String, String> request){
        String username = request.get("username");
        String password = request.get("password");
        String secretKeywordRequest = request.get("secretKeyword");

        if (!secretKeywordRequest.equals(secretKeyword)){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Invalid secret keyword");
        }

        String encodedPassword = passwordEncoder.encode(password);
        User newUser = new User(username,password);
        userRepository.save(newUser);

        return ResponseEntity.ok("User registered successfully");
    }
}
