package com.lt.bean;

import java.util.Objects;

public class RegisterCourse  {

    private long courseId;
    private String courseName;
    private double courseFee;
    private String courseType;
    private String courseDuration;
    private String courseDetails;
    private long numberOfStudents;
    private long professorId;

    public RegisterCourse(){}

    public RegisterCourse(long courseId, String courseName, double courseFee, String courseType, String courseDuration, String courseDetails) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.courseType = courseType;
        this.courseDuration = courseDuration;
        this.courseDetails = courseDetails;
    }


    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    public long getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(long numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(long professorId) {
        this.professorId = professorId;
    }

    @Override
    public String toString() {
        return "\n RegisterCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseFee=" + courseFee +
                ", courseType='" + courseType + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseDetails='" + courseDetails + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisterCourse)) return false;
        RegisterCourse that = (RegisterCourse) o;
        return getCourseId() == that.getCourseId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCourseId());
    }
}
