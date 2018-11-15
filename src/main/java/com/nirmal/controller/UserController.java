package com.nirmal.controller;

import java.util.List;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.nirmal.domain.User;
import com.nirmal.service.UserService;

@RestController
@RequestMapping(path = "user")
public class UserController {
  public static final int ID_LENGTH = 10;

  @Autowired
  User user;

  @Autowired
  UserService userService;


  @GetMapping(path = "searchUserByFirstName")
  public List<User> searchUserByFirstName(@RequestParam(required = true) String firstName) {
    List<User> list = userService.getUserByFirstName(firstName);
    return list;
  }

  @PostMapping(value = "/insertUser", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
      produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
  public User insertUser(@RequestBody User user) {
    boolean inserted = userService.insertData(user);
    if (inserted)
      return user;
    else
      return null;
  }

  public String generateUniqueId() {
    return RandomStringUtils.randomAlphanumeric(ID_LENGTH);
  }
}
