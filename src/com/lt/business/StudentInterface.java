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

    public void studentViewAllCourses();
    public void viewAvailableCourses();
    public boolean registerToCourse(Courses courses);
    public void withdrawFromCourse() throws IOException;
    public List<Courses> viewAllRegisteredCourses();

}


