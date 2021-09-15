package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.RegisterCourse;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.dao.StudentDaoImpl;
import com.lt.dao.StudentDaoInterface;

import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collectors;

import static com.lt.dao.CourseCatalogDao.*;
import static com.lt.dao.RegisterCourseDao.registerCourseMap;
//import static com.lt.dao.StudentDao.studentsList;

public class StudentImplService extends User implements StudentDaoInterface {
    //public  Set<RegisterCourse> registerCourseList = new HashSet<RegisterCourse>();

    StudentDaoImpl studentDao = null;
    boolean flag = false;

    //this method will do Student Sign up
    @Override
    public boolean signUp(Student student) throws SQLException {
        studentDao = new StudentDaoImpl();
        flag = studentDao.signUp(student);
        return flag;

    }

    @Override
    public boolean registerForCourse(Long semesterId, Long courseId) {
        return false;
    }

    @Override
    public List<Courses> viewRegisteredCourses(Long semesterId) {
        return null;
    }

    @Override
    public boolean removeCourse(Long courseId) {
        return false;
    }

//    @Override
//    public boolean signUp(Student student) {
//        map.put(student.getStudentEmail(),student);
//        Set<String> set= map.keySet();
//        Iterator iterator= set.iterator();
//        while (iterator.hasNext()){
//            System.out.println(map.get(iterator.next()));
//        }
//        return true;
//    }
//
//    @Override
//    public boolean registerToCourse(RegisterCourse newCourses) {
//
//        if(registerCourseMap.size()==0)
//        {
//            registerCourseMap.put(newCourses.getCourseId(), newCourses);
//        }
//        registerCourseMap.put(newCourses.getCourseId(), newCourses);
//        Set<Long> set= registerCourseMap.keySet();
//        Iterator<Long> iterator= set.iterator();
//        while (iterator.hasNext()){
//            Long id = iterator.next();
//            RegisterCourse registerCourse = registerCourseMap.get(id);
//            System.out.println(registerCourse);
//            registerCourseList.add(registerCourse);
//        }
//        return true;
//
//    }
//
//    //show the list of courses registered by Students
//    @Override
//    public List<RegisterCourse> studentViewRegisteredCourses() {
//
//        System.out.println(registerCourseList.stream().collect(Collectors.toList()));
//        return registerCourseList.stream().collect(Collectors.toList());
//    }
//
//
//    //get the list of available courses from Course Catalog map
//    @Override
//    public List<Courses> viewAvailableCourses() {
//        List<Courses>  availableCoursesList = null;
//        Set<Long> set= courseCatalogMap.keySet();
//        Iterator<Long> iterator = set.iterator();
//        while (iterator.hasNext()){
//            Long courseIdFetch = iterator.next();
//            availableCoursesList =courseCatalogMap.get(courseIdFetch).getCoursesList();
//        }
//        System.out.println(availableCoursesList);
//        return availableCoursesList;
//    }
//
//
//    //get details of selected course from Course map
//    @Override
//    public Courses getDetailsofSelectedCourse(Long id) {
//        Courses selectedCourse = null;
//        Set<Long> set= coursesMap.keySet();
//        Iterator<Long> iterator = set.iterator();
//        while (iterator.hasNext()){
//            Long courseIdFetch = iterator.next();
//            if(courseIdFetch == id) {
//                selectedCourse = coursesMap.get(courseIdFetch);
//                break;
//            }
//        }
//        return selectedCourse;
//    }
//
//    // delete course from  registered course map
//    @Override
//    public boolean withdrawFromCourse(Long id) {
//        Set<Long> set = registerCourseMap.keySet();
//        Iterator<Long> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Long courseIdDelete = iterator.next();
//            RegisterCourse course = registerCourseMap.get(courseIdDelete);
//            if (courseIdDelete == id) {
//                registerCourseMap.remove(courseIdDelete);
//                registerCourseList.remove(course);
//                break;
//            }
//        }
//        return true;
//    }
//
//    @Override
//    public void payFees() {
//
//    }
//
//    @Override
//    public void updateDetails() {
//
//    }
//
//    @Override
//    public void viewReportCard() {
//
//    }
//

}
