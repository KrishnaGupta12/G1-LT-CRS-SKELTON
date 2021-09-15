package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.Student;
import com.lt.constants.SqlConstants;
import com.lt.util.DBUtil;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class StudentDaoImpl implements StudentDaoInterface{
    Connection con  = DBUtil.getConnection();
    PreparedStatement smt = null;

    @Override
    public boolean signUp(Student student) throws SQLException {
       smt= con.prepareStatement(SqlConstants.INSERT_TO_STUDENT);
       smt.setInt(1, (int) student.getStudentId());
       smt.setString(2, student.getStudentName());
       smt.setString(3, student.getStudentEmail());
       smt.setString(4, String.valueOf(student.getGender()));
       smt.setDate(5, new Date(student.getStudentDOB().getTime()));
       smt.setInt(6, (int) student.getContact_no());
       smt.setInt(7,(int)student.getSemester_id());
      int flag =  smt.executeUpdate();
      if(flag !=0)
          return true;
        return false;
    }

    @Override
    public boolean registerForCourse(Long semesterId, Long courseId) {
        return false;
    }

    @Override
    public List<Courses> viewRegisteredCourses(Long semesterId) {
        return null;
    }

    @Override
    public boolean removeCourse(Long courseId) {
        return false;
    }

//  public static   Map<String,Student> map = new HashMap<String,Student>();
//    static {
//        map.put("krishna@gmail.com",new Student(1002,"Krishna","krishna@gmail.com",'M',new Date("04/10/1992"),"root"));
//        map.put("sneha@gmail.com",new Student(1003,"Sneha","sneha@gmail.com",'F',new Date("04/09/1995"),"root"));
//        map.put("satyam@gmail.com",new Student(1004,"satyam","satyam@gmail.com",'M',new Date("04/09/1998"),"root"));
//    }


}

