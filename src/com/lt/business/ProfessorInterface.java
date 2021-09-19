package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Grade;
import com.lt.bean.Professor;
import com.lt.bean.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface ProfessorInterface {
    //public boolean signUp(Professor professor) throws SQLException;

    public void viewFullCourses(long professorId);

    public void addGrade(Grade grade) throws SQLException;

    public List<Courses> getListofStudents( long studentId,long semesterId) throws SQLException;

    public List<Student> viewRegisteredStudents(long professorId);

    public long getProfessorId(String username) throws SQLException;

}
