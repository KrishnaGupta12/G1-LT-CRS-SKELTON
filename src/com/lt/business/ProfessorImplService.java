package com.lt.business;

import com.lt.bean.*;
import com.lt.dao.ProfessorDaoImpl;
import com.lt.dao.StudentDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ProfessorImplService extends User implements ProfessorInterface {
    @Override
    public void viewFullCourses(long professorId) {
        ProfessorDaoImpl pdo = new ProfessorDaoImpl();
        List<Courses> courseList = pdo.getCourseList(professorId);
        System.out.println(courseList);
    }

    @Override
    public void addGrade(long courseId, long studentId, String grade) {
        System.out.println("Add grades");
        ProfessorDaoImpl pdo = new ProfessorDaoImpl();
        //boolean addgrades = pdo.addGrades();
      //  System.out.println(addgrades);
    }

    @Override
    public List<Student> viewRegisteredStudents(long professorId) {
        ProfessorDaoImpl pdo = new ProfessorDaoImpl();
        List<Student> studentList = pdo.getStudentList(professorId);
        return studentList;
    }

    @Override
    public long getProfessorId(String username) throws SQLException {
        ProfessorDaoImpl pdo = new ProfessorDaoImpl();
       long prof_id= pdo.getProfessorId(username);
        return prof_id;
    }

}



