package com.lt.dao;

import com.lt.bean.CourseCatalog;
import com.lt.bean.Courses;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 
 *Course DAO Interface for getting list of register courses  
 *
 */
public interface CourseDaoInterface {


    public boolean registerCourse(long course_id, long semester_id) throws SQLException;
    public List<Courses> showAvailableCourses(long semesterId) throws SQLException;


}
