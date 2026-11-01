package com.example.classmath.repository;

import com.example.classmath.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {}
// spring data JPA сам напишет SQL запросы для сохранения и поиска