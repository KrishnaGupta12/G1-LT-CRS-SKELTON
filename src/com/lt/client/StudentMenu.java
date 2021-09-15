package com.lt.client;
import com.lt.bean.Courses;
import com.lt.bean.RegisterCourse;
import com.lt.bean.Student;
import com.lt.business.StudentImplService;
import com.sun.javafx.image.BytePixelSetter;

import java.util.*;
public class StudentMenu {
    public void studentSession(String userName) {
        System.out.println("Welcome " +userName + " to your panel. Have a Good day!!");
        System.out.println("------------------------------------------------------------");
        StudentImplService studentImplService= new StudentImplService();

        Boolean permission = true;
        while (permission) {
            System.out.println("Choose your Tasks");
            System.out.println("1. Register Course");
            System.out.println("2. Remove course");
            System.out.println("3. View Course");
            System.out.println("4. Pay Fees");
            System.out.println("5. Update Profile");
            System.out.println("6. Logout");
            Scanner sc = new Scanner(System.in);
            int task = sc.nextInt();
//            switch (task) {
//                case 1:
//                    System.out.println("Register Course");
//                    System.out.println("-----------------------------------------------");
//                    System.out.println("Choose a Course from the Below List : ");
//                    List<Courses> availableList = studentImplService.viewAvailableCourses();
//                    System.out.println("Enter Course Id of course you want to register: ");
//                    Long courseId = sc.nextLong();
//                    Courses selectedCourse = studentImplService.getDetailsofSelectedCourse(courseId);
//                    System.out.println("selected " +selectedCourse);
//                    RegisterCourse newCourse = new RegisterCourse(selectedCourse.getCourseId(), selectedCourse.getCourseName(), selectedCourse.getCourseFee(), selectedCourse.getCourseType(), selectedCourse.getCourseDuration(), selectedCourse.getCourseDetails());
//                    boolean flag = studentImplService.registerToCourse(newCourse);
//                    if(flag){
//                        System.out.println("Course Register SuccessFully..!");
//                    }else
//                        System.out.println("Sorry!! Seats are Full!! Try Different Course..");
//
//                    System.out.println("***************************************************");
//                    break;
//                case 2:
//                    System.out.println("Remove course");
//                    System.out.println("-----------------------------------------------");
//                    System.out.println("Your Registered Courses are : \n");
//                    studentImplService.studentViewRegisteredCourses();
//                    System.out.println("Enter Course Id of course you want to Delete: ");
//                    Long deleteCourseId = sc.nextLong();
//                    boolean status = studentImplService.withdrawFromCourse(deleteCourseId);
//                    if(status)
//                        System.out.println("Course deleted SuccessFully..!");
//                    else
//                        System.out.println("Invalid CourseId");
//                    System.out.println("***************************************************");
//                    break;
//                case 3:
//                    System.out.println("View Registered Courses");
//                    studentImplService.studentViewRegisteredCourses();
//                    System.out.println("***************************************************");
//                    break;
//                case 4:
//                    System.out.println("Pay Fees");
//                    System.out.println("***************************************************");
//                    break;
////                case 5:
////                    System.out.println("Update Profile");
////                    System.out.println("***************************************************");
////                    break;
//                case 5:
//                    System.out.println("Exit");
//                    System.out.println("***************************************************");
//                    System.exit(0);
//                default:
//                    System.out.println("No task for the day");
//            }
        }
    }
}