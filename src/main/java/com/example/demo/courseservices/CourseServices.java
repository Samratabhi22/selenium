package com.example.demo.courseservices;

import java.util.List;

import com.example.demo.controller.Courses;

public interface CourseServices {
	public List<Courses> getCourses();
	public Courses getCourse(long parseLong);
	public Courses addCourses(Object course);
	public Courses updateCourse(Courses courses);
	public void deleteCourse(long parseLong);

}
