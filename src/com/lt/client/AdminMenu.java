package com.lt.client;

import com.lt.bean.Courses;
import com.lt.bean.Professor;
import com.lt.business.AdminImplService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class AdminMenu {

    public void adminSession(String username) throws SQLException, IOException {

        AdminImplService adminImplService = new AdminImplService();
        System.out.println("Welcome " + username + ". Have a Good day!!");
        Boolean permission = true;
        while (permission) {
            System.out.println("Choose your Tasks");
            System.out.println("1. Add Professor");
            System.out.println("2. Approve Student");
            System.out.println("3. Add course ");
            System.out.println("4. Delete course");
            System.out.println("5. Generate report cards");
            System.out.println("6. Edit Course");
            System.out.println("7. View All Courses");
            System.out.println("8. View Registered Student for Courses");
            System.out.println("9. Exit");
            Scanner sc = new Scanner(System.in);
            int task = sc.nextInt();
            switch (task) {
                case 1:
                    System.out.println(" Insert the details for add Professor ....!!!");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter the Professor Id: ");
                    Long proId = sc.nextLong();
                    System.out.println("Enter the Professor Name : ");
                    String proName = sc.next();
                    System.out.println("Enter the Professor Email: ");
                    String proEmail = sc.next();
                    System.out.println("Enter the Course Id  ");
                    long courseID = sc.nextLong();
                    System.out.println("Enter Professor Department Name");
                    String proDepartmentName = sc.next();
                    System.out.println("Enter the Professor Password : ");
                    String password = sc.next();
                    Professor professor = new Professor(proId, proName, proEmail, courseID, proDepartmentName, password);
                    adminImplService.addProfessor(professor);

                    break;

                case 2:
                    System.out.println("List Of Students waiting for Approval :  ");
                    System.out.println(adminImplService.showListOfPendingStudent());

                    System.out.println("Enter the Student id ");
                    int studentid = sc.nextInt();
                    System.out.println(adminImplService.showListOfPendingStudent());

                    adminImplService.approveStudent(studentid);
                    System.out.println("Successfully Approved : ");

                    break;

                case 3:
                    System.out.println("Create course ");
                    System.out.println(" Insert the Course  Details  ....!!!");
                    System.out.println("------------------------------------------");
                    System.out.println("Enter the Course Id: ");
                    long courseId = sc.nextLong();
                    System.out.println("Enter the Course Name : ");
                    String courseName = sc.nextLine();
                    System.out.println("Enter the Course Fees : ");
                    Double courseFees = sc.nextDouble();
                    System.out.println("Enter the CourseDuration : ");
                    String courseDuration = sc.nextLine();
                    System.out.println("Enter the Course Type : ");
                    String courseType = sc.nextLine();
                    System.out.println("Enter the Course Details : ");
                    String courseDetails = sc.nextLine();
                    System.out.println("Enter the Course Semester Id  : ");
                    long courseSemesterId = sc.nextLong();
                    System.out.println("Enter the professor Id  :");
                    long professorId = sc.nextLong();

                    Courses courses = new Courses(courseId, courseName, courseFees, courseDuration, courseType, courseDetails, courseSemesterId, professorId);
                    adminImplService.addCourse(courses);
                    System.out.println(" Course Details Updated SuccessFully  !!!");
                    break;

                case 4:
                    System.out.println(" Delete The Course................");
                    System.out.println("Enter The courseId");
                    long crsId = sc.nextLong();
                    // Course courses1 = new Course(crsId);
                    // AdminDaoImpl adminDaoImpl1 = new AdminDaoImpl();
                    adminImplService.deleteCourse(crsId);

                    break;

                case 5:
                    System.out.println("Generate report cards");
                    break;

                case 6:
                    System.out.println("Edit Course");
                    break;

                case 7:
                    System.out.println("View All Courses");
                   /* AdminDaoImpl adminDao = new AdminDaoImpl();
                    adminDao.adminViewAllCourses();*/
                    adminImplService.adminViewAllCourses();
                    break;

                case 8:
                    System.out.println("View Registered Student for Courses");
                    break;


                case 9:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("No task for the day");
            }
        }
    }
}
