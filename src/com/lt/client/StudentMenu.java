package com.lt.client;
import com.lt.bean.Courses;
import com.lt.bean.Payment;
import com.lt.bean.RegisterCourse;
import com.lt.business.StudentImplService;
import com.lt.constants.ModeOfPayment;

import java.sql.SQLException;
import java.util.*;


/**
 * @author 
 * Student Individual Menu with all the Student functionality 
 *
 */
public class StudentMenu {
    public void studentSession(String userName,long student_id) throws SQLException {
        System.out.println("Welcome " +userName + " to your panel. Have a Good day!!");
        System.out.println("---------------------------------------------------------------");
        StudentImplService studentImplService= new StudentImplService();

        Boolean permission = true;
        while (permission) {
            System.out.println("Choose your Tasks");
            System.out.println("1. Register Course");
            System.out.println("2. Remove course");
            System.out.println("3. View Course");
            System.out.println("4. Pay Fees");
            System.out.println("5. View Grade Report");
            System.out.println("6. Logout");
            Scanner sc = new Scanner(System.in);
            int task = sc.nextInt();
            switch (task) {
                case 1 :
                   System.out.println("Register Course");
                   System.out.println("-----------------------------------------------");
                   System.out.println("Enter Semester id");
                   long semester_id = sc.nextLong();
                   System.out.println("Choose a Course from the Below List available for selected semester : ");
                   List<Courses> availableList= studentImplService.showAvailableCourses(semester_id);
                    System.out.println(availableList);
                   System.out.println("Enter Course Id of course you want to register: ");
                   long courseId = sc.nextLong();
                   boolean flag = studentImplService.registerForCourse(student_id,semester_id,courseId);
                    if(flag){
                        System.out.println("Course Registered ..! Payment Status is pending. Please Pay your fees");
                    }else
                        System.out.println("Sorry!! Seats are Full!! Try Different Course..");

                    System.out.println("***************************************************");
                    break;
                case 2:
                    System.out.println("Remove course");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter Semester id");
                    long s_id = sc.nextLong();
                    System.out.println("Your Registered Courses are : \n");
                     Set<RegisterCourse> list =  studentImplService.viewRegisteredCourses(student_id,s_id);
                    System.out.println(list);
                    System.out.println("Enter Course Id of course you want to Delete: ");
                    Long deleteCourseId = sc.nextLong();
                    boolean status = studentImplService.removeCourse(deleteCourseId);
                    if(status)
                        System.out.println("Course deleted SuccessFully..!");
                    else
                        System.out.println("Invalid CourseId");
                    System.out.println("***************************************************");
                    break;
                case 3:
                    System.out.println("Enter Semester id");
                    long sem_id = sc.nextLong();
                    System.out.println("View Registered Courses");
                    Set<RegisterCourse> registeredCourses = studentImplService.viewRegisteredCourses(student_id,sem_id);
                    System.out.println(registeredCourses);
                    System.out.println("***************************************************");
                    break;
                case 4:
                    System.out.println("Pay Fees");
                   Set<RegisterCourse> pendingPaymentList = studentImplService.showListofPendingPayment(student_id);
                    System.out.println(pendingPaymentList);
                   if(pendingPaymentList.size() == 0){
                       System.out.println("No courses pending for payment");
                   }
                   else {
                       System.out.println("Enter Course id");
                       long course_Id = Long.parseLong(sc.next());
                       System.out.println("Enter Mode of Payment");
                       String modePayment = sc.next();
                       System.out.println("Enter Amount to pay");
                       double amount = Double.parseDouble(sc.next());
                       long transactionId = Long.parseLong(studentImplService.generateTransactionId());
                       Payment payment = new Payment(amount, modePayment,transactionId);
                       boolean paymentFlag = studentImplService.payfees(course_Id, payment,student_id);
                       if (paymentFlag) {
                           System.out.println("Payment Successful..!");
                       } else {
                           System.out.println("Payment failed..!");
                       }
                   }
                    System.out.println("***************************************************");
                    break;
                case 6:
                    System.out.println("Exit");
                    System.out.println("**********************SESSION LOGGED OUT*****************************");
                    System.exit(0);
                default:
                    System.out.println("No task for the day");

            }
        }
    }
}