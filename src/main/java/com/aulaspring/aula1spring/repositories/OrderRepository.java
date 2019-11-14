package com.aulaspring.aula1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.aula1spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
