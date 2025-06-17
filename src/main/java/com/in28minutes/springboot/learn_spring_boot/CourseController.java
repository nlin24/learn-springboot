package com.in28minutes.springboot.learn_spring_boot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> RetrieveAllCourses() {
		return Arrays.asList(new Course(1, "Learn AWS", "in28minutes"), new Course(2, "Learn DevOp", "in28minutes"),
				new Course(3, "Learn Google Cloud", "in28minutes"), new Course(4, "Learn Azure", "in28minutes"));
	}
}
