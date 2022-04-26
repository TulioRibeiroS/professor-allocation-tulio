package com.project.professorallocation.service;

import java.text.ParseException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Course;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class CourseServiceTest {
	
	@Autowired
	CourseService service;
	
	@Test
	public void create() throws ParseException {
		Course course = new Course();
		course.setId(1L);
		course.setName("Teste");
		
		course = service.create(course);
	}
	
	@Test
	public void findById() {
		Long id = 1L;
		Course course = service.findById(id);
		System.out.println(course);
	}
	
	@Test
	public void findAll() {
		List<Course> course = service.findAll();
		course.forEach(System.out::println);
	}
	
	@Test
	public void deleteById() {
		Long id = 1l;
		service.deleteById(id);
	}
	
	@Test
	public void deleteAll() {
		service.deleteAll();
	}
}
