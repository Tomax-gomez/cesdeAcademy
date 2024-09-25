package com.cesde.academic.service;

import com.cesde.academic.domain.Student;
import com.cesde.academic.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp  implements StudentService{

    @Autowired
    private StudentRepo studentRepo;
    @Override
    public List<Student> createStudent(Student student){
        return null;
    };
    public List<Student> getStudent (Integer StudentId){
        return null;
    }

    @Override
    public List<Student> getStudent() {
        return null;
    }

    public List<Student> getStudentById (Integer StudentId){
        return null;
    }
    public List<Student> updateStudent(Student student){
        return null ;
    }

    @Override
    public List<Student> deleteStudent(Integer idStudent) {
        return null;
    }
}
