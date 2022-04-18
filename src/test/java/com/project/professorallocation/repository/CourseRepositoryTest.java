package com.project.professorallocation.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Course;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class CourseRepositoryTest {
	
	@Autowired
	CourseRepository courseRepository;
	
	@Test
	public void findAll() {
		List<Course> items = courseRepository.findAll();
		System.out.println("Qtd elementos retornados: "+ items.size());
		
		for(Course item : items) {
			System.out.println(item);
		}
	}
	
	@Test
	public void create() {
		Course courseBeingCreated = new Course();
		courseBeingCreated.setName("");
		
		courseBeingCreated = courseRepository.save(courseBeingCreated);
		System.out.println(courseBeingCreated);
	}
	
	@Test
	public void update() {
		Course courseBeingCreated = new Course();
		courseBeingCreated.setId(1l);
		courseBeingCreated.setName("");
		
		courseBeingCreated = courseRepository.save(courseBeingCreated);
		System.out.println(courseBeingCreated);
	}

	@Test
	public void delete() {
		courseRepository.deleteById(null);
	}
	
	@Test
	public void deleteAllItems() {
		courseRepository.deleteAllInBatch();
	}	
}
