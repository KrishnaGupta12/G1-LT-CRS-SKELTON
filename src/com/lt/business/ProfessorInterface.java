package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Professor;
import com.lt.bean.Student;

import java.util.ArrayList;
import java.util.List;

public interface ProfessorInterface {
    public boolean login(Professor professor);

    public List<Courses> viewFullCourses();
    public  void addGrade();
    public List<Student> viewRegisteredStudents();

}
