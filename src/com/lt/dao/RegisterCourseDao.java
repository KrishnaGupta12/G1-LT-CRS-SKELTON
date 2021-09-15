package com.lt.dao;

import com.lt.bean.RegisterCourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


public class RegisterCourseDao {
    public static Map<Long, RegisterCourse> registerCourseMap = new HashMap<Long, RegisterCourse>();

    //dummy data for register course by students
    static{
      //  registerCourseList.add(new RegisterCourse(101,"Java",3000l,"FullTime","3 Months","Programming Language"));
   // registerCourseMap.put(101L,new RegisterCourse(101,"Java",3000l,"FullTime","3 Months","Programming Language") );
    }
}
