package com.lt.constants;

public interface SqlConstants {

    //User table queries
    public final static String USER_TABLE_DATA = "select role from User where username =? && password=?";
    public final static String INSERT_TO_USER = "insert into user values (?,?,?)";

    //Student Table queries
    public final static String INSERT_TO_STUDENT = "insert into Student values (?,?,?,?,?,?,?)";

    //Professor Table queries
    public final static String INSERT_TO_PROFESSOR = "insert into Professor values (?,?,?,?,?,?,?)";
    public final static String VIEW_COURSE = "select * from course";
    public final static  String ADD_GRADES=" insert into grade values (?,?,?) ";
    public final static String VIEW_REG_STUDENT = "select * from student where profid=" ;

    //Semester Table queries

    //Course Table queries

    //RegisterCourse Table queries

    //Admin Table queries

    //CourseCatalog Table queries

    //GradeCard Table queries


}
