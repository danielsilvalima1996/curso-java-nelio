package com.danielsilvalima.course.repositories;

import com.danielsilvalima.course.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
