package com.example.demo.mapper;

import com.example.demo.entity.UserEntity;
import com.example.demo.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
  public User toModel(UserEntity entity) {
    return new User(entity.getId(), entity.getFirstName(), entity.getLastName(), entity.getEmail());
  }
}
