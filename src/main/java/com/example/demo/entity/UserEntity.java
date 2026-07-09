package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class UserEntity {
  @Id private UUID id;
  private String firstName;
  private String lastName;
  private String email;
}
