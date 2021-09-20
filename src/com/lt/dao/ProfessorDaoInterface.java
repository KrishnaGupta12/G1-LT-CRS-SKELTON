package com.lt.dao;

import com.lt.bean.Courses;
import com.lt.bean.Grade;
import com.lt.bean.Professor;
import com.lt.bean.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Professor DAO Interface with all student Methods
 */
public interface ProfessorDaoInterface {

    /**
     * Method to show list of courses teach by professor student from database
     *
     * @param professorId: professor id for which list of courses should be displayed
     * @return some set  of pending payments
     */
    public List<Courses> getCourseList(long professorId);

    /**
     * Method to show list of students from database
     *
     * @param studentId: studentId for which display list of students
     * @param semesterId: semesterId list for this student
     * @return some list  of students
     */
    public List<Courses> getListofStudents( long studentId,long semesterId) throws SQLException;

    /**
     * Method to add grade to database
     *
     * @param grade: Grade to be added for course
     * @return void
     */
    public void addGrade(Grade grade) throws SQLException;

    /**
     * Method to show list of students to  student from database
     *
     * @param professor_id: professor id for which the student to be displayed
     * @return some list  of students
     */
    public List<Student> getStudentList(long professor_id);

    /**
     * Method to show get professor  from database
     *
     * @param username: username for which professor details will be fetch from db
     * @return some set  of pending payments
     */
    public long getProfessorId(String username) throws SQLException;


}