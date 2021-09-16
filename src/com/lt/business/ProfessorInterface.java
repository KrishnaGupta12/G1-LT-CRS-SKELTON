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

    public void viewFullCourses();
    public  void addGrade(long courseId,long studentId, String grade);
    public List<Student> viewRegisteredStudents();

}
