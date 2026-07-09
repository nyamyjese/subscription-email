package com.example.demo.mapper;

import com.example.demo.entity.CourseEntity;
import com.example.demo.models.Course;

public class CourseMapper {
  public Course toModel(CourseEntity entity) {
    return new Course(entity.getId(), entity.getTitle(), entity.getStart(), entity.getEnd());
  }
}
