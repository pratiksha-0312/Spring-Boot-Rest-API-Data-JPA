package com.springrest.course_rest_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.course_rest_api.dto.Course;

public interface CourseDao extends JpaRepository<Course, Integer> {

}
