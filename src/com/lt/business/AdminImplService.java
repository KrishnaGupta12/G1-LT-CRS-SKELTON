package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AdminImplService implements AdminInterface{


    @Override
    public void adminLogin() {

    }

    @Override
    public void addProfessor() {

    }

    @Override
    public boolean approveStudent() {
        return false;
    }

    @Override
    public void generateReportCard() {

    }

    @Override
    public void createCourse() throws IOException {

    }

    @Override
    public void deleteCourse() throws IOException {

    }

    @Override
    public void editCourse() throws IOException {

    }

    @Override
    public List<Courses> displayACourse() throws IOException {
        return null;
    }

    @Override
    public void registerStudent() throws IOException {

    }

    @Override
    public List<Courses> adminViewAllCourses() {
        return null;
    }

    @Override
    public List<Courses> viewFullCourses() {
        return null;
    }

    @Override
    public List<Student> viewRegisteredStudents() throws IOException {
        return null;
    }
}
