package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Student;

import java.io.IOException;
import java.util.List;

public interface StudentInterface{

    public void payFees();
    public void updateDetails();
    public void viewReportCard();
    public boolean signUp(Student student);

    public List<String> studentViewAllCourses();
    public List<Courses> viewAvailableCourses();
    public void registerToCourse() throws IOException;
    public void withdrawFromCourse() throws IOException;
    public List<Courses> viewAllRegisteredCourses();

}


