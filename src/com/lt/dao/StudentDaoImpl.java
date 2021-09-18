package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.Payment;
import com.lt.bean.RegisterCourse;
import com.lt.bean.Student;
import com.lt.constants.SqlConstants;
import com.lt.util.DBUtil;

import java.sql.*;
import java.sql.Date;
import java.util.*;

/**
 * @author 
 * Implementation of Student DAO Interface all methods to interacts with DB
 *
 */

public class StudentDaoImpl implements StudentDaoInterface {
    Connection con  = DBUtil.getConnection();
    PreparedStatement smt = null;
    static int count  = 10001;

    /**
     * Student signup method 
     *
     */
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
    
    /**
     * Student Register for Courses Method Implementation
     *
     */
    @Override
    public boolean registerForCourse(long student_id, long semesterId, long courseId) throws SQLException {
        smt = con.prepareStatement(SqlConstants.REGISTER_COURSE);
        smt.setInt(1, (int)student_id);
        smt.setInt(2, (int)semesterId);
        smt.setInt(3, (int)courseId);
        int flag = smt.executeUpdate();
        if(flag!=0)
            return true;
        return false;
    }

    /**
     * Show list of registered courses by student
     *
     */
    @Override
    public Set<RegisterCourse> viewRegisteredCourses(long studentId,long semesterId) throws SQLException {
       Set<RegisterCourse> registeredList = new HashSet<RegisterCourse>();
        smt = con.prepareStatement(SqlConstants.LIST_REGISTERED_COURSES);
        ResultSet rs = smt.executeQuery();
        while(rs.next()){
            long course_id = rs.getInt(1);
            String course_name = rs.getString(2);
            double course_fees = rs.getDouble(3);
            String course_duration = rs.getString(4);
            String course_type=rs.getString(5);
            String course_details =rs.getString(6);
            String paymentStatus = rs.getString(7);
            long course_semester_id = rs.getInt(8);
            long student_id = rs.getInt(9);
            RegisterCourse neWCourse = new RegisterCourse(course_id ,course_name,course_fees,course_duration,course_details,course_type,paymentStatus);
            if(course_semester_id ==semesterId && student_id == studentId )
                 registeredList.add(neWCourse);
        }
        return registeredList;
    }

    
    /**
     * Student removing courses method implementation
     */
    @Override
    public boolean removeCourse(long courseId) throws SQLException {
        smt = con.prepareStatement(SqlConstants.REMOVE_COURSE);
        smt.setInt(1, (int)courseId);
        int flag = smt.executeUpdate();
        if(flag !=0)
            return true;
        return false;
    }

    /**
     * Show list of student
     */
    @Override
    public long getStudent(String username) throws SQLException {
      //  Student student = null;
        long stud_id=0L ;
        smt = con.prepareStatement(SqlConstants.GET_STUDENT_DATA);
        smt.setString(1,username);
       ResultSet rs =  smt.executeQuery();
        while(rs.next()){
            stud_id = (long)rs.getInt(1);
        }
        return stud_id;
    }

    
    
    /**
     *Show available courses method
     */
    @Override
    public List<Courses> showAvailableCourses(long semesterId) throws SQLException {
        List<Courses> availableList = new ArrayList<Courses>();
        smt = con.prepareStatement(SqlConstants.AVAILABLE_COURSES);
        smt.setInt(1, (int) semesterId);
        ResultSet rs = smt.executeQuery();
        while(rs.next()){
            long course_id = rs.getInt(1);
            String course_name = rs.getString(2);
            double course_fees = rs.getDouble(3);
            String course_duration = rs.getString(4);
            String course_type=rs.getString(5);
            String course_details =rs.getString(6);
            Courses neWCourse = new Courses(course_id ,course_name,course_fees,course_duration,course_type,course_details);
            availableList.add(neWCourse);
        }
        return availableList;
    }

    /**
     *Show List of Courses with Pending payment status
     */
    @Override
    public  Set<RegisterCourse> showListofPendingPayment(long student_id) throws SQLException {
        Set<RegisterCourse> list = new HashSet<RegisterCourse>();
        smt = con.prepareStatement(SqlConstants.PENDING_PAYMENT_LIST);
        ResultSet rs = smt.executeQuery();
        while (rs.next()) {
            long course_id = rs.getInt(1);
            String course_name = rs.getString(2);
            double course_fees = rs.getDouble(3);
            String course_duration = rs.getString(4);
            String course_type = rs.getString(5);
            String course_details = rs.getString(6);
            String paymentStatus = rs.getString(7);
            long studentid = rs.getInt(8);
            RegisterCourse neWCourse = new RegisterCourse(course_id, course_name, course_fees, course_duration, course_details, course_type, paymentStatus);
            if(neWCourse.getPaymentStatus().equalsIgnoreCase("pending") && studentid == student_id)
                list.add(neWCourse);
        }
        return list;
    }

    /**
     * Registered Course Payfees Method 
     */
    @Override
    public boolean payfees(long courseId, Payment payment, long studentId) throws SQLException {
        smt =con.prepareStatement(SqlConstants.INSERT_PAYMENT_STATUS);
        smt.setString(1,payment.getBillingMode());
        smt.setDouble(2,payment.getBillingAmount());
        smt.setInt(3,(int)courseId);
        smt.setInt(4,(int)studentId);
        smt.setInt(5, (int) payment.getTransactionId());

        if(smt.executeUpdate() !=0){
            smt = con.prepareStatement(SqlConstants.UPDATE_PAYMENT_STATUS);
            smt.setInt(1,(int)courseId);
            smt.setInt(2,(int)studentId);
            int flag = smt.executeUpdate();
            System.out.println("Billing details updated");
            return true;
        }
    return  false;
    }
}

//  public static   Map<String,Student> map = new HashMap<String,Student>();
//    static {
//        map.put("krishna@gmail.com",new Student(1002,"Krishna","krishna@gmail.com",'M',new Date("04/10/1992"),"root"));
//        map.put("sneha@gmail.com",new Student(1003,"Sneha","sneha@gmail.com",'F',new Date("04/09/1995"),"root"));
//        map.put("satyam@gmail.com",new Student(1004,"satyam","satyam@gmail.com",'M',new Date("04/09/1998"),"root"));
//    }





