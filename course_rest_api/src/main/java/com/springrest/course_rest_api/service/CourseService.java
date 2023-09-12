package com.springrest.course_rest_api.service;

import java.util.List;

import com.springrest.course_rest_api.dto.Course;

public interface CourseService {
	public List<Course> getCourses();

	public Course getCourse(int courseId);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(int parseInt);

}
