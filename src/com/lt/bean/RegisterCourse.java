package com.lt.bean;

public class RegisterCourse {

    private long courseId;
    private String courseName;
    private String courseDetails;
    private long numberOfStudents;
    private long professorId;

    public RegisterCourse(){}
    public RegisterCourse(long courseId, String courseName, String courseDetails, long numberOfStudents, long professorId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDetails = courseDetails;
        this.numberOfStudents = numberOfStudents;
        this.professorId = professorId;
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
}
