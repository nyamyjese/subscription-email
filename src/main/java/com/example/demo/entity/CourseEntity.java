package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.UUID;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class CourseEntity {
  @Id private UUID id;
  private String title;
  private Instant start;
  private Instant end;
}
