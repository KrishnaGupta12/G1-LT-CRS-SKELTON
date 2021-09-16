package com.lt.bean;

import java.util.Date;

public class Professor {

    private long professorId;
    private String professorName;
    private String professorEmail;
    private char gender;
    private Date professorDOB;
    private long contact_no;
    private long course_id;
    private String passWord;

    public Professor() {
    }

    public Professor(long professorId, String professorName, String professorEmail, char gender, Date professorDOB, long contact_no, long course_id) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.professorEmail = professorEmail;
        this.gender = gender;
        this.professorDOB = professorDOB;
        this.contact_no = contact_no;
        this.course_id = course_id;
    }

    public long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(long professorId) {
        this.professorId = professorId;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getProfessorEmail() {
        return professorEmail;
    }

    public void setProfessorEmail(String professorEmail) {
        this.professorEmail = professorEmail;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getProfessorDOB() {
        return professorDOB;
    }

    public void setProfessorDOB(Date professorDOB) {
        this.professorDOB = professorDOB;
    }

    public long getContact_no() {
        return contact_no;
    }

    public void setContact_no(long contact_no) {
        this.contact_no = contact_no;
    }

    public long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(long course_id) {
        this.course_id = course_id;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "professorId=" + professorId +
                ", professorName='" + professorName + '\'' +
                ", professorEmail='" + professorEmail + '\'' +
                ", gender=" + gender +
                ", professorDOB=" + professorDOB +
                ", contact_no=" + contact_no +
                ", course_id=" + course_id +
                '}';
    }
}