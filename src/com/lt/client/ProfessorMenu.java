package com.lt.client;

import com.lt.bean.Courses;
import com.lt.business.ProfessorImplService;
import com.lt.business.ProfessorInterface;
import com.lt.business.StudentImplService;

import java.util.Scanner;

public class ProfessorMenu {

    public void professorSession(String userName) {
        System.out.println("Welcome " + userName + " to your panel. Have a Good day!!");
        System.out.println("------------------------------------------------------------");
        ProfessorImplService professorImplService = new ProfessorImplService();
        Boolean permission = true;
        while (permission) {
            System.out.println("Choose your Tasks");
            System.out.println("1. View List of Courses"); // those courses which a professor can teach added by admin
            System.out.println("2. Add grades"); // for those courses that can be teach by him bases on student
            System.out.println("3. View Student data"); // list of student registered under some course
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
                    break;

                case 3:
                    System.out.println("Registered Course");
                    break;

                case 4:
                    System.out.println("View Student data");
                    break;


                case 5:
                    System.out.println("Exit");
                    System.exit(0);

                default:
                    System.out.println("No task for the day");
            }
        }
    }
}
