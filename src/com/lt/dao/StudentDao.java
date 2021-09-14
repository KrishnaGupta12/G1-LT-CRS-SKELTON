package com.lt.dao;

import com.lt.bean.Student;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDao {
  public static   List<Student> studentsList = new ArrayList<Student>();
    static {

        studentsList.add(new Student(1001, "Divyansh", "divyansh@gmail.com", 'M', new Date("04/09/1992")));
        studentsList.add(new Student(1002,"Krishna","krishna@gmail.com",'M',new Date("04/10/1992")));
        studentsList.add(new Student(1003,"Sneha","sneha@gmail.com",'F',new Date("04/09/1995")));
        studentsList.add(new Student(1004,"satyam","satyam@gmail.com",'M',new Date("04/09/1998")));
    }

    public boolean signupStudent(Student student){
        studentsList.add(student);
        return true;
    }

}

