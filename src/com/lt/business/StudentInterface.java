package com.lt.business;

import java.io.IOException;

public interface StudentInterface{

    public  void login();
    public void payFees();
    public void updateDetails();
    public void viewReportCard();

    public void studentViewAllCourses();
    public void viewAvailableCourses();
    public void registerToCourse() throws IOException;
    public void withdrawFromCourse() throws IOException;
    public void viewAllRegisteredCourses();

}


