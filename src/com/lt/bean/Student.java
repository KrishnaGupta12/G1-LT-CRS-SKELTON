package com.lt.bean;

import java.util.Date;
import java.util.List;

public class Student extends User {
    private long studentId;
    private String studentName;
    private String studentEmail;
    private char gender;
    private Date studentDOB;
    private String passWord;
    private List<Courses> listCourses;

    public Student() {
    }

    public Student(long studentId, String studentName, String studentEmail, char gender, Date studentDOB, String passWord) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.gender = gender;
        this.studentDOB = studentDOB;
        this.passWord = passWord;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getStudentDOB() {
        return studentDOB;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setStudentDOB(Date studentDOB) {
        this.studentDOB = studentDOB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", gender=" + gender +
                ", studentDOB=" + studentDOB +
                '}';
    }
}
