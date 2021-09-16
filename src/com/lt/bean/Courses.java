package com.lt.bean;

public class Courses {
    private long courseId;
    private String courseName;
    private double courseFee;
    private String courseType;
    private String courseDuration;
    private String courseDetails;
    private long noOfStudent;
    private long professorId;



    public Courses(){}

    public Courses(long courseId, String courseName, double courseFee, String courseType, String courseDuration, String courseDetails) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.courseType = courseType;
        this.courseDuration = courseDuration;
        this.courseDetails = courseDetails;

    }
    /*public Courses(long courseId, String courseName, double courseFee, String courseType, String courseDuration, String courseDetails, long noOfStudent, long professorId) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseFee = courseFee;
        this.courseType = courseType;
        this.courseDuration = courseDuration;
        this.courseDetails = courseDetails;
        this.noOfStudent = noOfStudent;
        this.professorId = professorId;
    }*/


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

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(String courseDetails) {
        this.courseDetails = courseDetails;
    }

    public long getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(long noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(long professorId) {
        this.professorId = professorId;
    }

    @Override
    public String toString() {
        return "\nCourses{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseFee=" + courseFee +
                ", courseType='" + courseType + '\'' +
                ", courseDuration='" + courseDuration + '\'' +
                ", courseDetails='" + courseDetails + '\'' +
                '}';
    }
}
