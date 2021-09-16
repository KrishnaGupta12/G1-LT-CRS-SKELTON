package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.Grade;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.constants.SqlConstants;
import com.lt.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDaoImpl implements ProfessorDaoInterface {

    @Override
    public List<Courses> getCourseList() {
        List<Courses> list = new ArrayList<Courses>();
        Connection con = null;
        PreparedStatement ps = null;
        String sql = SqlConstants.VIEW_COURSE;
        try
        {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Courses cs = new Courses();
                cs.setCourseId(rs.getLong(1));
                cs.setCourseName(rs.getString(2));
                cs.setCourseFee(rs.getDouble(3));
                cs.setCourseType(rs.getString(4));
                cs.setCourseDuration(rs.getString(5));
                cs.setCourseDetails(rs.getString(6));
                list.add(cs);
            }
        }
        catch(Exception e) {
            e.getMessage();
        }
        return list;
    }

    @Override
    public boolean addGrades() {
        Connection con = null;
        PreparedStatement ps = null;
        Grade grade = new Grade();
        int status = 0;
        boolean result = false;
        String sql = SqlConstants.ADD_GRADES;
        try
        {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setLong(1,grade.getCourseId());
            ps.setLong(2,grade.getStudentId());
            ps.setString(3,grade.getGrade());
            status = ps.executeUpdate();
            if(status>0)
            {
                result = true;
            }
        }
        catch(Exception e)
        {
           e.getMessage();
        }
        return result;
    }

    @Override
    public List<Student> getStudentList() {
        List<Student> list = new ArrayList<Student>();
        Connection con = null;
        PreparedStatement ps = null;
        String sql = SqlConstants.VIEW_REG_STUDENT;
        try
        {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Student student = new Student();
                student.setStudentId(rs.getInt(1));
                student.setStudentName(rs.getString(2));
                student.setStudentEmail(rs.getString(3));
                student.setGender(rs.getString(4));
                student.setStudentDOB(rs.getDate(5));
                student.setContact_no(rs.getLong(6));
                student.setSemester_id(rs.getLong(7));
                list.add(student);
            }
            }
        catch(Exception e)
        {
            e.getMessage();
        }
        return list;
    }
}
