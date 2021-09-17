package com.lt.client;

import com.lt.bean.Courses;
import com.lt.bean.Grade;
import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.business.ProfessorImplService;
import com.lt.business.ProfessorInterface;
import com.lt.business.StudentImplService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

/**
 * @author 
 * Professor Individual Menu with all the professor functionality 
 *
 */
public class ProfessorMenu {
    public void professorSession(String userName,long professorId) throws SQLException {
        System.out.println("Welcome " + userName + " to your panel. Have a Good day!!");
        System.out.println("------------------------------------------------------------");
        ProfessorImplService professorImplService = new ProfessorImplService();

        Boolean permission = true;
        while (permission) {
            System.out.println("Choose your Tasks");
            System.out.println("1. View List of Courses"); // those courses which a professor can teach added by admin
            System.out.println("2. Add grades"); // for those courses that can be teach by him bases on student
            System.out.println("3. View Registered courses"); // list of student registered under some course
            System.out.println("4. Logout");
            Scanner sc = new Scanner(System.in);
            int task = sc.nextInt();
            switch (task) {
                case 1:
                    System.out.println("View Course");
                    Courses courses = new Courses();
                    professorImplService.viewFullCourses();

                    break;

                case 2:
                    System.out.println("Add grades");
                    Grade grades = new Grade();
                    System.out.println("Enter CourseId : ");
                    int courseId = sc.nextInt();
                    System.out.println("Enter StudentId : ");
                    long studentId = sc.nextLong();
                    System.out.println("Enter Grade : ");
                    String grade = sc.nextLine();
                    professorImplService.addGrade(courseId,studentId,grade);
                    break;

                case 3:
                    System.out.println("View Registered Course");
                    List<Student> studList = professorImplService.viewRegisteredStudents (professorId);
                    System.out.println(studList);
                    break;

                /*case 4:
                    System.out.println("View Student data");
                    break;*/


                case 4:
                    System.out.println("Exit");
                    System.exit(0);

                default:
                    System.out.println("No task for the day");
            }
        }
    }
}
