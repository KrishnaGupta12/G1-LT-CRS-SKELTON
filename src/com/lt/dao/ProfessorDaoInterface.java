package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.Grade;
import com.lt.bean.Professor;
import com.lt.bean.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Professor DAO Interface with all student Methods
 */
public interface ProfessorDaoInterface {

    public List<Courses> getCourseList(long professorId);

    public boolean addGrades(long professorId, Grade grade);

    public List<Student> getStudentList(long professor_id);

    public long getProfessorId(String username) throws SQLException;


}