package com.lt.exception;

import com.lt.bean.Student;

import java.util.List;

public class StudentDetailsNotFoundException extends Exception{
public StudentDetailsNotFoundException(){
}
public String getMsg(){
    return " No Any Student Available for Approve";
}
}
