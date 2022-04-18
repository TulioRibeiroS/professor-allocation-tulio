package com.project.professorallocation.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Professor;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class ProfessorRepositoryTest {
	
	@Autowired
	ProfessorRepository professorRepository;
	
	@Test
	public void findAll() {
		List<Professor> items = professorRepository.findAll();
		System.out.println("Qtd elementos retornados: "+ items.size());
		
		for(Professor item : items) {
			System.out.println(item);
		}
	}
	
	@Test
	public void create() {
		Professor professorBeingCreated = new Professor();
		professorBeingCreated.setName("");
		
		professorBeingCreated = professorRepository.save(professorBeingCreated);
		System.out.println(professorBeingCreated);
	}
	
	@Test
	public void update() {
		Professor professorBeingCreated = new Professor();
		professorBeingCreated.setId(1l);
		professorBeingCreated.setName("");
		
		professorBeingCreated = professorRepository.save(professorBeingCreated);
		System.out.println(professorBeingCreated);
	}

	@Test
	public void delete() {
		professorRepository.deleteById(null);
	}
	
	@Test
	public void deleteAllItems() {
		professorRepository.deleteAllInBatch();
	}	
}
