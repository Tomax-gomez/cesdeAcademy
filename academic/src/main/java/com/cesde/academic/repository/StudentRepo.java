package com.cesde.academic.repository;

import com.cesde.academic.perisitence.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {


}
