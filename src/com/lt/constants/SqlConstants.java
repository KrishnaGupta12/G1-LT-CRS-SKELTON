package com.lt.constants;

public interface SqlConstants {

    public final static String USER_TABLE_DATA = "select role from User where username =? && password=?";
    public final static String INSERT_TO_USER = "insert into user values (?,?,?)";
    public final static String INSERT_TO_STUDENT = "insert into Student values (?,?,?,?,?,?,?)";

}
