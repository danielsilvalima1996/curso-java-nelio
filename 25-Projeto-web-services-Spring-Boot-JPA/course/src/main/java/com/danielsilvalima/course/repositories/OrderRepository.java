package com.danielsilvalima.course.repositories;

import com.danielsilvalima.course.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
