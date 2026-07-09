package com.example.demo.mapper;

import com.example.demo.dto.SubscriptionRequest;
import com.example.demo.entity.SubscriptionEntity;
import com.example.demo.models.Subscription;
import java.util.UUID;

public class SubscriptionMapper {
  public SubscriptionEntity toEntity(UUID id, SubscriptionRequest request) {
    var entity = new SubscriptionEntity();
    entity.setId(id);
    entity.setUserId(request.id());
    entity.setCourseId(request.courseId());
    return entity;
  }

  public Subscription toModel(SubscriptionEntity entity) {
    return new Subscription(entity.getId(), entity.getUserId(), entity.getCourseId());
  }
}
