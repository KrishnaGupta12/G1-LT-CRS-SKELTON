package com.lt.business;

import com.lt.bean.*;
import com.lt.dao.AdminDaoImpl;
import com.lt.dao.AdminDaoInterface;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class AdminImplService extends User implements AdminDaoInterface {

    AdminDaoImpl adminDao = new AdminDaoImpl();
    boolean flag = false;


    @Override
    public void addProfessor(Professor professor) throws SQLException {

        adminDao.addProfessor(professor);

    }

    @Override
    public void approveStudent(int studentId) throws SQLException {

        adminDao.approveStudent(studentId);

    }

    @Override
    public List<Student> showListOfPendingStudent() throws SQLException {

        List<Student> pendingStudent = adminDao.showListOfPendingStudent();
        return pendingStudent;
    }

    @Override
    public void generateReportCard() throws SQLException{
        adminDao.generateReportCard();

    }

    @Override
    public void addCourse(Courses course) throws SQLException {
        adminDao.addCourse(course);

    }

    @Override
    public void deleteCourse(long courseId) throws IOException, SQLException {
        adminDao.deleteCourse(courseId);

    }


    @Override
    public List<Courses> adminViewAllCourses() throws SQLException {

        List<Courses> viewAllCourses = adminDao.adminViewAllCourses();

        return viewAllCourses;
    }

    @Override
    public List<Student> viewRegisteredStudents() throws IOException {
        return null;
    }


}
