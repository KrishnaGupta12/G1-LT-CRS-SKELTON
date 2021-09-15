package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.*;

import java.sql.SQLException;
import java.util.*;

public interface StudentDaoInterface {




    public boolean signUp(Student student) throws SQLException; //insert query
    public boolean registerForCourse(Long semesterId,Long courseId); // insert query + select data from course table
    public List<Courses> viewRegisteredCourses(Long semesterId); // select query from registerCourse table
    public boolean removeCourse(Long courseId); // delete query from registerCourse table





}
