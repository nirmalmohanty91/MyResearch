package com.nirmal.cache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.nirmal.domain.Users;
import com.nirmal.repository.UsersRepository;

@Component
public class UsersCache {
    @Autowired
    UsersRepository usersRepository;

    @Cacheable(value = "usersCache", key = "#name")
    public Users getUser(String name) {
        System.out.println("Retrieving from Database for name: " + name);
        return usersRepository.findByName(name);
    }
}
