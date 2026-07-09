package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.Data;

@Entity
@Table(name = "subscription")
@Data
public class SubscriptionEntity {
  @Id private UUID id;
  private UUID userId;
  private UUID courseId;
}
