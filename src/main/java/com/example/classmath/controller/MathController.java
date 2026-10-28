package com.example.classmath.controller;


import com.example.classmath.dto.MathRequestDTO;
import com.example.classmath.entity.UserEntity;
import com.example.classmath.repository.UserRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/math")
public class MathController {

    private final UserRepository userRepository;

    public MathController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    // 1. Сложение
    @PostMapping("/add")
    public double add(@RequestBody MathRequestDTO request) {
        return request.getFirstNumber() + request.getSecondNumber();
    }

    // 2. Вычитание
    @PostMapping("/subtrack")
    public double subtrack(@RequestBody MathRequestDTO request) {
        return request.getFirstNumber() - request.getSecondNumber();
    }
    // 3. Умножение
    @PostMapping("/multiply")
    public double multiply(@RequestBody MathRequestDTO request) {
        return request.getFirstNumber() * request.getSecondNumber();
    }
    // 4. Деление
    @PostMapping("/divide")
    public Object divide(@RequestBody MathRequestDTO request) {
        try {
            if (request.getSecondNumber() == 0) {
                throw new ArithmeticException("На ноль делить нельзя!");
            }
            return request.getFirstNumber() / request.getSecondNumber();
        } catch (ArithmeticException e) {
            return e.getMessage();
        }
    }
    // 5. Возведение в степень
    @PostMapping("/power")
    public double power(@RequestBody MathRequestDTO request) {
        return Math.pow(request.getFirstNumber(), request.getSecondNumber());
    }

    // 6. Квадратный корень из первого числа
    @PostMapping("/sqrt")
    public Object sqrt(@RequestBody MathRequestDTO request) {
        try {
            if (request.getFirstNumber() < 0) {
                throw new IllegalArgumentException("Нельзя извлечь корень из отрицательного числа!");
            }
            return Math.sqrt(request.getFirstNumber());
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    // 7. Максимум из двух чисел
    @PostMapping("/max")
    public double max(@RequestBody MathRequestDTO request) {
        return Math.max(request.getFirstNumber(), request.getSecondNumber());
    }

    // 8. Минимум из двух чисел
    @PostMapping("/min")
    public double min(@RequestBody MathRequestDTO request) {
        return Math.min(request.getFirstNumber(), request.getSecondNumber());
    }

    // 9. Остаток от деления (модуль)
    @PostMapping("/mod")
    public double mod(@RequestBody MathRequestDTO request) {
        return request.getFirstNumber() % request.getSecondNumber();
    }

    // 10. Абсолютное значение (модуль числа)
    @PostMapping("/abs")
    public double abs(@RequestBody MathRequestDTO request) {
        return Math.abs(request.getFirstNumber());
    }

    // 11. Факториал (для целой части первого числа)
    @PostMapping("/factorial")
    public Object factorial(@RequestBody MathRequestDTO request) {
        int n = (int) request.getFirstNumber();
        try {
            if (n < 0) {
                throw new IllegalArgumentException("Факториал определен только для неотрицательных чисел!");
            }
            if (n > 20) {
                throw new IllegalArgumentException("Число слишком велико, факториал не поместится в память!");
            }
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
    }

    // 12. Округление вверх до ближайшего целого
    @PostMapping("/ceil")
    public double ceil(@RequestBody MathRequestDTO request) {
        return Math.ceil(request.getFirstNumber());
    }
}
