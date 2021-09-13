package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Student;

import java.io.IOException;
import java.util.ArrayList;

public interface AdminInterface {
    public void adminLogin();
    public void addProfessor();
    public void approveStudent();

    public void generateReportCard();
    public void createCourse() throws IOException;
    public void deleteCourse() throws IOException;
    public void editCourse() throws IOException;
    public void displayACourse() throws IOException;
    public void registerStudent() throws IOException;
    public void adminViewAllCourses();
    public ArrayList<Courses> viewFullCourses();
    public void viewRegisteredStudents() throws IOException;


}
