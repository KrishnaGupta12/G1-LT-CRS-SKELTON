package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Student;
import com.lt.bean.User;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.lt.dao.CourseCatalogDao.coursesList;
import static com.lt.dao.CourseCatalogDao.coursesMap;
import static com.lt.dao.StudentDao.map;
//import static com.lt.dao.StudentDao.studentsList;

public class StudentImplService extends User implements StudentInterface {

    @Override
    public void payFees() {

    }

    @Override
    public void updateDetails() {

    }

    @Override
    public void viewReportCard() {

    }

    @Override
    public boolean signUp(Student student) {
        map.put(student.getStudentEmail(),student);
        Set<String> set= map.keySet();
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
        return true;
    }

    @Override
    public void studentViewAllCourses() {
        for (Courses courses:coursesList) {
            System.out.println(courses);
        }
    }


    @Override
    public void viewAvailableCourses() {
        for (Courses courses:coursesList) {
            System.out.println(courses);
        }
    }

    @Override
    public boolean registerToCourse(Courses newCourses) {

        coursesMap.put(newCourses.getCourseId(), newCourses);
        Set<Long> set= coursesMap.keySet();
        Iterator iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println(coursesMap.get(iterator.next()));
        }
        return true;

    }

    @Override
    public void withdrawFromCourse() throws IOException {

    }

    @Override
    public List<Courses> viewAllRegisteredCourses() {
        return null;
    }
}
