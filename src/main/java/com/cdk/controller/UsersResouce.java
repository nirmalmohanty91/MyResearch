package com.cdk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.cache.UsersCache;
import com.cdk.domain.Users;

@RestController
@RequestMapping(value="/users")
public class UsersResouce {
    @Autowired
    UsersCache usersCache;

    @GetMapping(value = "/{name}")
    public Users getUser(@PathVariable final String name) {
        return usersCache.getUser(name);
    }
    
    
    
}
