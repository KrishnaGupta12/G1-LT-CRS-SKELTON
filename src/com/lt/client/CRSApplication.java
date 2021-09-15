
package com.lt.client;

import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.business.ProfessorImplService;
import com.lt.business.StudentImplService;
import com.lt.business.UserImplService;
import com.lt.constants.Role;
import com.lt.constants.SqlConstants;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class CRSApplication {
    public static void main(String[] args) throws ParseException, SQLException {
        StudentImplService studentImplService = new StudentImplService();
        ProfessorImplService professorImplService = new ProfessorImplService();
        UserImplService userImplService = new UserImplService();


        System.out.println("Welcome to CRSApplication");
        System.out.println("-----------------------------------------------");

        Boolean permission = true;
        while(permission)
        {
            System.out.println("1. Login");
            System.out.println("2. Sign up Student");
            System.out.println("3. Update password");
            System.out.println("4. Exit");
            System.out.println("Choose your Choice");
            Scanner sc =new Scanner(System.in);
            int role = sc.nextInt();
            switch(role) {
                case 1:
                    String rol ="" ;
                    System.out.println("Login");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter UserName : ");
                    String userName = sc.next();
                    System.out.println("Enter Password : ");
                    String passWord = sc.next();
                    rol = userImplService.login(userName,passWord);

                    if(rol.equalsIgnoreCase(Role.STUDENT.toString()))
                    {
                        StudentMenu studentmenu = new StudentMenu();
                        studentmenu.studentSession(rol);
                    }
                    else if(rol.equalsIgnoreCase(Role.PROFESSOR.toString()))
                    {
                        ProfessorMenu professorMenu = new ProfessorMenu();
                        professorMenu.professorSession(rol);
                    }
                    else if(rol.equalsIgnoreCase(Role.ADMIN.toString())) {
                        AdminMenu admin = new AdminMenu();
                        admin.adminSession(rol);
                    }
                    else
                    {
                        System.out.println("Invalid user");
                    }
                    System.out.println("***************************************************");
                    break;



                case 2:
                    System.out.println("Sign up Student");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter your Id: ");
                    Long studId = sc.nextLong();
                    System.out.println("Enter your Name : ");
                    String studName = sc.next();
                    System.out.println("Enter your Email: ");
                    String studEmail = sc.next();
                    System.out.println("Enter your Gender: ");
                    String studGender = sc.next();
                    char studGen = studGender.charAt(0);
                    System.out.println("Enter your DOB: ");
                    String studDobs = sc.next();
                    Date studDob=new SimpleDateFormat("dd/MM/yyyy").parse(studDobs);
                    System.out.println("Enter your Contact No: ");
                    Long studContact = sc.nextLong();
                    System.out.println("Enter Semester id: ");
                    Long studSemester = sc.nextLong();
                    System.out.println("Enter your New PassWord: ");
                    String stdPassword = sc.next();
                    Student student = new Student(studId,studName,studEmail,studGen,studDob,studContact,studSemester);
                    boolean flag = studentImplService.signUp(student);
                    if(flag){
                        System.out.println("SignUp SuccessFul");
                    }else
                        System.out.println("Approval is Pending from Admin");
                    System.out.println("***************************************************");
                    break;

                case 3:
                    System.out.println("Update Password");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter Old Password");
                    String oldPassword=sc.nextLine();
                    System.out.println("Enter New Password");
                    String newPassword=sc.nextLine();
                    System.out.println("Enter Confirm Password");
                    String confPassword=sc.nextLine();
                    if(newPassword.equals(confPassword))
                    {
                        System.out.println("Password changed Successfully");
                    }
                    else
                    {
                        System.out.println("password do not Match");
                    }
                    System.out.println("***************************************************");
                    break;

                case 4:
                    System.out.println("Exit");
                    System.out.println("**************Your Session is Logged out*******************");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    System.out.println("***************************************************");
            }
        }
        System.out.println("");


    }
}
