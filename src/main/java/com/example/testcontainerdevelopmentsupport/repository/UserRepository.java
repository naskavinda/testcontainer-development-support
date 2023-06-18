package com.example.testcontainerdevelopmentsupport.repository;

import com.example.testcontainerdevelopmentsupport.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
