package com.aulaspring.aula1spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.aula1spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
