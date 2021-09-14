package com.lt.bean;

public class Professor {

    private long professorId;
    private String professorName;
    private String professorEmail;

    public Professor(){}
    public Professor(long professorId, String professorName, String professorEmail) {
        this.professorId = professorId;
        this.professorName = professorName;
        this.professorEmail = professorEmail;
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
}
