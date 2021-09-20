package com.lt.business;

import com.lt.bean.*;
import com.lt.dao.CourseDaoImpl;
import com.lt.dao.StudentDaoImpl;
import com.lt.dao.StudentDaoInterface;

import java.sql.SQLException;
import java.util.*;
//import static com.lt.dao.StudentDao.studentsList;

/**
 * @author Student Business Layer implementing student DAO.
 */
public class StudentImplService implements StudentDaoInterface {

    StudentDaoImpl studentDao = StudentDaoImpl.getInstance();
    CourseDaoImpl courseDao = null;
    boolean flag = false;


    /**
     * this method will do Student Sign up
     */
    @Override
    public boolean signUp(Student student) throws SQLException {
        //studentDao = new StudentDaoImpl();
        flag = studentDao.signUp(student);
        return flag;

    }


    /**
     * register for course
     */
    @Override
    public boolean registerForCourse(long student_id, long semesterId, long courseId) throws SQLException {
        //  studentDao = new StudentDaoImpl();
        flag = studentDao.registerForCourse(student_id, semesterId, courseId);
        return flag;
    }


    /**
     * show list of registered courses by student
     */
    @Override
    public Set<RegisterCourse> viewRegisteredCourses(long studentId, long semesterId) throws SQLException {
        // studentDao = new StudentDaoImpl();
        Set<RegisterCourse> registeredList = studentDao.viewRegisteredCourses(studentId, semesterId);
        return registeredList;
    }

    /**
     * remove registered courses method
     */
    @Override
    public boolean removeCourse(long courseId) throws SQLException {
        return studentDao.removeCourse(courseId);
    }

    /**
     * get student ID method
     */
    @Override
    public Student getStudent(String username) throws SQLException {
        // studentDao = new StudentDaoImpl();
        Student st = studentDao.getStudent(username);
        return st;
    }

    /**
     * show list of available courses
     */
    @Override
    public List<Courses> showAvailableCourses(long semesterId) throws SQLException {
        List<Courses> list = null;
        // studentDao = new StudentDaoImpl();
        list = studentDao.showAvailableCourses(semesterId);
        return list;
    }

    /**
     * show list of registered courses with pending payment status
     */
    @Override
    public Set<RegisterCourse> showListofPendingPayment(long student_id) throws SQLException {
        Set<RegisterCourse> list = new HashSet<RegisterCourse>();
        //  studentDao = new StudentDaoImpl();
        list = studentDao.showListofPendingPayment(student_id);
        return list;
    }

    /**
     * payfees method
     */
    @Override
    public boolean payfees(long courseId, Payment payment, long studentId) throws SQLException {
        //  studentDao = new StudentDaoImpl();
        return studentDao.payfees(courseId, payment, studentId);
    }

    @Override
    public List<GradeCard> viewGradeCard(long semesterId, long studentId) throws SQLException {
        //  studentDao = new StudentDaoImpl();
        List<GradeCard> gradecard = studentDao.viewGradeCard(semesterId, studentId);
        return gradecard;
    }


    public String generateTransactionId() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%05d", number);
    }

}
