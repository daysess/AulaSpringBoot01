package com.aulaspring.aula1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.aula1spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
