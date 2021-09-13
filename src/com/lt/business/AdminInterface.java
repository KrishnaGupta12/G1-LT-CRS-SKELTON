package com.lt.business;

import com.lt.bean.Student;

public interface AdminInterface {
    public void adminLogin(String id,String pwd);
    public String addProfessor();
    public String approveStudent(Student);
    public String addCourse(int courseId,String courseName);
    public String generateReportCard(Student student);

}
