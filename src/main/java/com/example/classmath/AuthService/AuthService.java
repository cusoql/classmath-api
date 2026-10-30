package com.example.classmath.AuthService;

import com.example.classmath.AuthService.JwtService;
import com.example.classmath.entity.UserEntity;
import com.example.classmath.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final JwtService jwtService;

    public AuthService(UserRepository userRepository, JwtService jwtService) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
    }

    public String login(String name) {
        // 1. Находим пользователя в PostgreSQL по имени (или id)
        UserEntity user = userRepository.findById(Integer.valueOf(name))
                .orElseThrow(() -> new RuntimeException("Юзер не найден"));

        // 2. Передаем весь объект в JwtService — внутри вызовутся нужные геттеры
        String token = jwtService.generateToken(user);

        return token; // Возвращаем сгенерированный JWT клиенту
    }
}