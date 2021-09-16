package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.Professor;
import com.lt.bean.Student;

import java.sql.SQLException;
import java.util.List;

public interface ProfessorDaoInterface {

    public List<Courses> getCourseList();
    public boolean addGrades();
    public List<Student> getStudentList();



}