package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Student;
import com.lt.bean.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.lt.dao.StudentDao.studentsList;

public class StudentImplService extends User implements StudentInterface {

    @Override
    public void payFees() {

    }

    @Override
    public void updateDetails() {

    }

    @Override
    public void viewReportCard() {

    }

    @Override
    public boolean signUp(Student student) {
        studentsList.add(student);
        System.out.println(studentsList);
        return true;
    }

    @Override
    public List<String> studentViewAllCourses() {
        List<String> courseList = new ArrayList<String>();
        courseList.add("Java");
        courseList.add("Advance Java");
        courseList.add("Jdbc");
        courseList.add("Servelet");
        courseList.add("Jsp");
        courseList.add("Spring");
        courseList.add("SpringBoot");
        courseList.add("sql");
        courseList.add("MangoDB");
        courseList.add("mysql");
        courseList.add("html");
        courseList.add("css");
        courseList.add("javascripta");
        courseList.add("Angular");

        for (int i = 0; i < courseList.size(); i++) {
            // prints out the courses within the course list
            System.out.println("All Courses : "+ courseList.get(i));
        }
        return courseList;
    }




    @Override
    public List<Courses> viewAvailableCourses() {
        return null;
    }

    @Override
    public void registerToCourse() throws IOException {

    }

    @Override
    public void withdrawFromCourse() throws IOException {

    }

    @Override
    public List<Courses> viewAllRegisteredCourses() {
        return null;
    }
}
