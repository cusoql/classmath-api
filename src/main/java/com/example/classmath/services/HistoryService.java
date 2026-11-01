package com.example.classmath.services;

import com.example.classmath.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service //всегда используется при создании сервиса
public class HistoryService {
    private final UserRepository userRepository;

    public HistoryService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }





    public void saveOperation (double firstNumber, double secondNumber, double result) {
        // 2. TODO: Извлечь токен из authHeader (убрать префикс "Bearer ")
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            if (authentication != null) {
                Object credentials = authentication.getCredentials(); // Часто здесь лежит JWT токен
                String username = authentication.getName(); // Имя пользователя/Subject
            }
        }
        // 3. TODO: С помощью твоего JwtService / AuthService достать ID или данные пользователя из токена

        // 4. TODO: Найти пользователя через userRepository или подготовить UserEntity для сохранения результата

        // 5. TODO: Вызвать userRepository.save(...) для записи в БД


    }

