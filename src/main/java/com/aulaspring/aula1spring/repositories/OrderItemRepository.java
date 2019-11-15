package com.aulaspring.aula1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.aula1spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
