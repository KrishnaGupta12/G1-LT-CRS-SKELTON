package com.lt.business;

import com.lt.bean.Courses;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.lt.dao.CourseCatalogDao.coursesList;
import static com.lt.dao.ProfessorDao.professorMap;


public class ProfessorImplService extends User implements ProfessorInterface{

    @Override

        public boolean login(Professor professor) {
            professorMap.put(professor.getProfessorEmail(),professor);
            Set<String> set= professorMap.keySet();
            Iterator iterator= set.iterator();
            while (iterator.hasNext()){
                System.out.println(professorMap.get(iterator.next()));
            }
            return true;
        }

    @Override
    public List<Courses> viewFullCourses() {
        for (Courses courses:coursesList) {
            System.out.println(courses);
        }



        return null;
    }

    @Override
    public void addGrade() {

    }

    @Override
    public List<Student> viewRegisteredStudents() {
        return null;
    }
}
