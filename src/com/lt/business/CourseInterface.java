package com.lt.business;

import com.lt.bean.Courses;

import java.util.ArrayList;
import java.util.List;

public interface CourseInterface {
    public List<Courses> addCourse();

    public void deleteCourse();

    public List<Courses> getCourseCatalog();

    public boolean isCourseAvailable();
}
