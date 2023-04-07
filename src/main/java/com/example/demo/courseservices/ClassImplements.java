package com.example.demo.courseservices;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.CourseDao.CourseDao;
import com.example.demo.controller.Courses;
@Service
public class ClassImplements implements CourseServices{
private CourseDao coursedao;
List<Courses> list;
public ClassImplements() {
	list=new ArrayList<>();
	list.add(new Courses(145,"java courses","this course contains basic"));
	list.add(new Courses(125,"courses","this course contains basic java"));
}
//	@Override
//	public List<Courses> getCourses() {
//		// TODO Auto-generated method stub
//		
//	}
	@Override
	public Courses getCourse(long couseId) {
		Courses c=null;
		for(Courses course:list) {
			long courseId = 0;
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}
	public void deleteCourse(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
	@Override
	public Courses addCourses(Object course) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Courses updateCourse(Courses courses) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}
}
