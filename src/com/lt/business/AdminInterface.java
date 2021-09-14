package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface AdminInterface {
    public void adminLogin();
    public void addProfessor();
    public boolean approveStudent();

    public void generateReportCard();
    public void createCourse() throws IOException;
    public void deleteCourse() throws IOException;
    public void editCourse() throws IOException;
    public List<Courses> displayACourse() throws IOException;
    public void registerStudent() throws IOException;
    public List<Courses> adminViewAllCourses();
    public List<Courses> viewFullCourses();
    public List<Student> viewRegisteredStudents() throws IOException;


}
