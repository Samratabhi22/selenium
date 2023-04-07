package com.example.demo.controller;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.courseservices.CourseServices;

@RestController
public class MyController {

	private CourseServices courseServices;
	
	private Object courseService;
	
	private Object list;

	@GetMapping("/home")
	public String home(){
		return "welcome to courses application";
	}
	
//	@GetMapping("/courses")
//	public List<Courses> getCourses(){
//		return this.courseServices.getCourses();
//	}
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return ((CourseServices) this.courseService).getCourse(Long.parseLong(courseId));
		
	}
	@PostMapping(path="/courses",consumes="application/json")
	public Courses addCourses(@RequestBody Courses courses) {
	
		return  this.courseServices.updateCourse(courses);
		
	}
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus>
	deleteCourse(@PathVariable String courseId){
	try {
		((CourseServices)this.courseServices).deleteCourse(Long.parseLong(courseId));
		return new ResponseEntity<>(HttpStatus.OK);
	}
	catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}
}
