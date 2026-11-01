package com.example.classmath.controller;


import com.example.classmath.dto.MathRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/history")
public class HistoryController {

//    TODO: здесь чуть позже мы внедрим Service через конструктор (Dependency Injection)

    @PostMapping
    public  ResponseEntity<?> addHistory(@RequestBody MathRequestDTO requestDto) {
        // 1. Получает DTO , в котором уже хранятся нужные поля


        // TODO: 2. Передаются данные в сервис

        // 3. Возврщаем ответ клиенту
        return ResponseEntity.ok("Пример успешно сохранен!");
    }


}
