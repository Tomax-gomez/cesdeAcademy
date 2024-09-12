package com.academico.cesde.Service;

import com.academico.cesde.Domain.Student;

public interface StudentService {

    public void createStudent(Student student);
    public void listStudent(Student student);
    public void listStudentById(Student student);
}
