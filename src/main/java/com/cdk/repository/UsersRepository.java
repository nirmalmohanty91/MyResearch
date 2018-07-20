package com.cdk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdk.domain.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByName(String name);

}
