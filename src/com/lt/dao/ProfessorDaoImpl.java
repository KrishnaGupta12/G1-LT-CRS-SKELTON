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

/**
 * @author Implementation of Professor DAO Interface all methods to interacts with DB
 */
public class ProfessorDaoImpl implements ProfessorDaoInterface {

    @Override
    public List<Courses> getCourseList(long professorId) {
        List<Courses> list = new ArrayList<Courses>();
        Connection con = null;
        PreparedStatement ps = null;
        String sql = SqlConstants.VIEW_COURSE;
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (int) professorId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Courses cs = new Courses();
                cs.setCourseId(rs.getLong(1));
                cs.setCourseName(rs.getString(2));
                cs.setCourseFee(rs.getDouble(3));
                cs.setCourseType(rs.getString(4));
                cs.setCourseDuration(rs.getString(5));
                cs.setCourseDetails(rs.getString(6));
                list.add(cs);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return list;
    }


    @Override
    public boolean addGrades(long professorId, Grade grade) {
        Connection con = null;
        PreparedStatement ps = null;
        // Grade grade = new Grade();
        int status = 0;
        boolean result = false;
        List<Student> registeredStudent = getStudentList(professorId);
        String sql = SqlConstants.ADD_GRADES;
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setLong(1, grade.getCourseId());
            ps.setLong(2, grade.getStudentId());
            ps.setString(3, grade.getGrade());
            status = ps.executeUpdate();
            if (status > 0) {
                result = true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return result;
    }

    //List f students registered for a courses taught by the professor
    @Override
    public List<Student> getStudentList(long professorId) {
        List<Student> list = new ArrayList<Student>();
        Connection con = null;
        PreparedStatement ps = null;
        String sql = SqlConstants.VIEW_REG_STUDENT;
        try {
            con = DBUtil.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, (int) professorId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Student student = new Student();
                student.setStudentId(rs.getInt(1));
                student.setStudentName(rs.getString(2));
                student.setStudentEmail(rs.getString(3));
                student.setGender(rs.getString(4).charAt(0));
                student.setStudentDOB(rs.getDate(5));
                student.setContact_no(rs.getLong(6));
                student.setSemester_id(rs.getLong(7));
                list.add(student);
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return list;
    }

    //get user data
    @Override
    public long getProfessorId(String username) throws SQLException {
        Connection con = null;
        PreparedStatement ps = null;
        long prof_id = 0L;
        con = DBUtil.getConnection();
        ps = con.prepareStatement(SqlConstants.GET_PROFESSOR_DATA);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            prof_id = (long) rs.getInt(1);
        }
        return prof_id;
    }
}
