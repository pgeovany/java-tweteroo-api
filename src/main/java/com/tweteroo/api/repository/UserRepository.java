package com.tweteroo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}
