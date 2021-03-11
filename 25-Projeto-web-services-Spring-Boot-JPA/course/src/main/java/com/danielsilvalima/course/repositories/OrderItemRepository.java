package com.danielsilvalima.course.repositories;

import com.danielsilvalima.course.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
