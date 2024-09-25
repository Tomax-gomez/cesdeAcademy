package com.cesde.academic.service;

import com.cesde.academic.domain.Student;

import java.util.List;

public interface StudentService {

    public List<Student> getStudent();

    public List<Student> getStudentById(Integer StudentId);
    public List<Student> createStudent(Student student);
    public List<Student> updateStudent(Student student);
    public List<Student> deleteStudent(Integer idStudent);
}
