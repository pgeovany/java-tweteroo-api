package com.tweteroo.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.dto.UserDTO;
import com.tweteroo.api.model.User;
import com.tweteroo.api.repository.UserRepository;

@RestController
@RequestMapping("/api/user")
public class UserController {
 
  @Autowired
  private UserRepository repository;

  @PostMapping
  public void create(@RequestBody UserDTO request) {
    repository.save(new User(request));
  }
}
