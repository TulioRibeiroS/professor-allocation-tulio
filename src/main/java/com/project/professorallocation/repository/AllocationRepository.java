package com.project.professorallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professorallocation.model.Allocation;

@Repository
public interface AllocationRepository extends JpaRepository<Allocation, Long> {

}
