package com.lt.bean;

public class CourseCatalog {
    private long courseId;
    private long professorId;
    private long courseCatalogId;

    public  CourseCatalog(){}
    public CourseCatalog(long courseId, long professorId, long courseCatalogId) {
        this.courseId = courseId;
        this.professorId = professorId;
        this.courseCatalogId = courseCatalogId;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(long professorId) {
        this.professorId = professorId;
    }

    public long getCourseCatalogId() {
        return courseCatalogId;
    }

    public void setCourseCatalogId(long courseCatalogId) {
        this.courseCatalogId = courseCatalogId;
    }
}
