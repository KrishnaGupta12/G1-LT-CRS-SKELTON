package com.lt.business;

import com.lt.bean.*;
import com.lt.dao.ProfessorDaoImpl;
import com.lt.dao.StudentDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.lt.dao.CourseCatalogDao.coursesList;



public class ProfessorImplService extends User implements ProfessorInterface{
    @Override
    public void viewFullCourses() {
        System.out.println("View Full courses");
        ProfessorDaoImpl pdo = new ProfessorDaoImpl();
        List<Courses> courseList = pdo.getCourseList();
        System.out.println(courseList);
        for(Courses c : courseList)
        {
            System.out.println(c.getCourseId());
        }
    }

    @Override
    public void addGrade(long courseId,long studentId, String grade)
    {
        System.out.println("Add grades");
        ProfessorDaoImpl pdo = new ProfessorDaoImpl();
        boolean addgrades = pdo.addGrades();
        System.out.println(addgrades);
    }

    @Override
    public List<Student> viewRegisteredStudents() {
        System.out.println("View Full courses");
        ProfessorDaoImpl pdo = new ProfessorDaoImpl();
        List<Student> studentList = pdo.getStudentList();
        System.out.println(studentList);
        for(Student s : studentList)
        {
            System.out.println(s.getStudentId());
        }
        return null;
    }

    /*@Override

        public boolean login(Professor professor) {
            professorMap.put(professor.getProfessorEmail(),professor);
            Set<String> set= professorMap.keySet();
            Iterator iterator= set.iterator();
            while (iterator.hasNext()){
                System.out.println(professorMap.get(iterator.next()));
            }
            return true;
        }*/


   /* @Override
    public boolean signUp(Professor professor) throws SQLException {
        professorDao = new ProfessorDaoImpl();
        flag = professorDao.signUp(professor);
        return flag;
    }*/





}
