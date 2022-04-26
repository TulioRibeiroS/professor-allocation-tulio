package com.project.professorallocation.service;

import java.text.ParseException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.project.professorallocation.model.Professor;

@SpringBootTest
@TestPropertySource(locations = "classpath:application.properties")
public class ProfessorServiceTest {
	
	@Autowired
	ProfessorService service;
	
	@Test
	public void create() throws ParseException {
		Professor professor = new Professor();
		professor.setId(1L);
	}
}
