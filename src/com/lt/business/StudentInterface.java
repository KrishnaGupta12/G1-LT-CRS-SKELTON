package com.lt.business;

import com.lt.bean.CourseCatalog;
import com.lt.bean.Courses;

import java.io.IOException;
import java.util.List;

public interface StudentInterface{

    public  void login();
    public void payFees();
    public void updateDetails();
    public void viewReportCard();

    public List<CourseCatalog> studentViewAllCourses();
    public List<Courses> viewAvailableCourses();
    public void registerToCourse() throws IOException;
    public void withdrawFromCourse() throws IOException;
    public List<Courses> viewAllRegisteredCourses();

}


