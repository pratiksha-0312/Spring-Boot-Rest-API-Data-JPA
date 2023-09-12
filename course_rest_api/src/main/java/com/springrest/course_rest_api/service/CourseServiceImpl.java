package com.springrest.course_rest_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.course_rest_api.dao.CourseDao;
import com.springrest.course_rest_api.dto.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;

	//List<Course> list;

	public CourseServiceImpl() {
		/*list = new ArrayList<>();
		list.add(new Course(101, "Core Java", "Basics of Java"));
		list.add(new Course(102, "Spring", "Framework"));*/
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub

		/*Course course = null;
		for (Course c : list) {
			if (c.getId() == courseId)

			{
				course = c;
				break;
			}
		}*/

		return courseDao.findById(courseId).get();
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		//list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(int parseInt) {
		// TODO Auto-generated method stub
		courseDao.deleteById(parseInt);
	}

}
