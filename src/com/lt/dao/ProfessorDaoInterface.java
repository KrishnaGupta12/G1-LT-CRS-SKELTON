package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.Grade;
import com.lt.bean.Professor;
import com.lt.bean.Student;

import java.sql.SQLException;
import java.util.List;

public interface ProfessorDaoInterface {

    public List<Courses> getCourseList();
    public boolean addGrades(long professorId, Grade grade);
    public List<Student> getStudentList(long professor_id);
    public long getProfessorId(String username) throws SQLException;



}