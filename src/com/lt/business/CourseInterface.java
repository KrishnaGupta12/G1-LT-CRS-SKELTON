package com.lt.business;

import com.lt.bean.Courses;

import java.util.ArrayList;
import java.util.List;

public interface CourseInterface {
    public ArrayList<Courses> addCourse();
    public  void deleteCourse();
    public ArrayList<Courses> getCourseCatalog();
    public  boolean isCourseAvailable();
}
