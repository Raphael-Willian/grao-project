package com.grao.grao_app.controller;
import com.grao.grao_app.dto.AuthResponseDTO;
import com.grao.grao_app.dto.LoginRequestDTO;
import com.grao.grao_app.dto.RegisterRequestDTO;
import com.grao.grao_app.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<AuthResponseDTO> registerUser(@RequestBody RegisterRequestDTO request) {
        AuthResponseDTO registerResponse = authService.register(request);
        return ResponseEntity.ok(registerResponse);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> loginUser(@RequestBody LoginRequestDTO request) {
        AuthResponseDTO loginResponse = authService.login(request);
        return ResponseEntity.ok(loginResponse);
    }
}

