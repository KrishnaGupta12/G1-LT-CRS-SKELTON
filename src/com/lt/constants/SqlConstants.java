package com.lt.constants;

public interface SqlConstants {

    //User table queries
    public final static String USER_TABLE_DATA = "select role from User where username =? && password=?";
    public final static String INSERT_TO_USER = "insert into user values (?,?,?)";

    //Student Table queries
    public final static String INSERT_TO_STUDENT = "insert into Student values (?,?,?,?,?,?,?)";

    //Semester Table queries

    //Course Table queries

    //RegisterCourse Table queries

    //Admin Table queries

    //CourseCatalog Table queries

    //GradeCard Table queries


}
