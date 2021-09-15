package com.lt.dao;

import com.lt.bean.CourseCatalog;
import com.lt.bean.Courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseCatalogDao {
   public static  Map<Long, CourseCatalog> courseCatalogMap = new HashMap<Long,CourseCatalog>();
   public static  Map<Long, Courses>  coursesMap = new HashMap<Long,Courses>();
   public static  List<Courses> coursesList= new ArrayList<Courses>();


    static {
       Courses course1 = new Courses(101,"Java",3000l,"FullTime","3 Months","Programming Language",150,701);
       Courses course2 = new Courses(102,"Advance Java",2000l,"FullTime","3 Months","Programming Language",150,702);
       Courses course3 = new Courses(103,"Python",5000l,"FullTime","3 Months","Programming Language",150,703);

       coursesMap.put(course1.getCourseId(), course1);
       coursesMap.put(course2.getCourseId(), course2);
       coursesMap.put(course3.getCourseId(), course3);


       coursesList.add(course1);
       coursesList.add(course2);
       coursesList.add(course3);

        courseCatalogMap.put(201l, new CourseCatalog(course1.getCourseId(),701,201,coursesList));
        courseCatalogMap.put(202l, new CourseCatalog(course1.getCourseId(),702,202,coursesList));
        courseCatalogMap.put(203l, new CourseCatalog(course1.getCourseId(),703,203,coursesList));

    }

}
