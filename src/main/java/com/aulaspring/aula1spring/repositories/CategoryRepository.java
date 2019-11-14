package com.aulaspring.aula1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.aula1spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
