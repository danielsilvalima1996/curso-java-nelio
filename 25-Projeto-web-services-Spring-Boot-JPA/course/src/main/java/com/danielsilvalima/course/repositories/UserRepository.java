package com.danielsilvalima.course.repositories;

import com.danielsilvalima.course.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
