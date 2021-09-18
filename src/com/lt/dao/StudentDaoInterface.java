package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.*;

import java.sql.SQLException;
import java.util.*;

/**
 * @author 
 * Student DAO Interface with all student Methods 
 *
 */
public interface StudentDaoInterface {




    public boolean signUp(Student student) throws SQLException; //insert query
    public boolean registerForCourse(long student_id,long semesterid,long courseId ) throws SQLException; // insert query + select data from course table
    public Set<RegisterCourse> viewRegisteredCourses(long studentId,long semesterId) throws SQLException; // select query from registerCourse table
    public boolean removeCourse(long courseId) throws SQLException; // delete query from registerCourse table
    public long getStudent(String username) throws SQLException;
    public List<Courses> showAvailableCourses(long semesterId) throws SQLException;
    public Set<RegisterCourse> showListofPendingPayment(long student_id) throws SQLException;
    public boolean payfees(long courseId,Payment payment,long studentid) throws SQLException;





}
