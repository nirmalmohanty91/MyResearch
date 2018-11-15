package com.nirmal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nirmal.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);

}
