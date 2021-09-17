package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.RegisterCourse;
import com.lt.bean.Student;

import java.io.IOException;
import java.util.List;

/**
 * @author 
 * Student Interface with all the its methods.
 *
 */
public interface StudentInterface{


    public boolean signUp(Student student);
    public boolean registerToCourse(RegisterCourse courses);
    public boolean withdrawFromCourse(Long id) ;
    public List<RegisterCourse> studentViewRegisteredCourses();
    public List<Courses> viewAvailableCourses();
    public Courses getDetailsofSelectedCourse(Long id);

    public void payFees();
    public void updateDetails();
    public void viewReportCard();

}


