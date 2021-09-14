
package com.lt.client;

import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.business.StudentImplService;
import com.lt.constants.CommonData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CRSApplication {
    public static void main(String[] args) throws ParseException {
        StudentImplService studentImplService = new StudentImplService();


        System.out.println("Welcome to CRSApplication");
        System.out.println("-----------------------------------------------");
        System.out.println("1. Login");
        System.out.println("2. Sign up Student");
        System.out.println("3. Update password");
        System.out.println("4. Exit");
        Boolean permission = true;
        while(permission)
        {
            System.out.println("Choose your Choice");
            Scanner sc =new Scanner(System.in);
            int role = sc.nextInt();
            switch(role) {
                case 1:
                    System.out.println("Login");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter UserName : ");
                    String userName = sc.next();
                    System.out.println("Enter Password : ");
                    String passWord = sc.next();
                    User user = new User(userName,passWord);
                    if(CommonData.studUserName.equals(userName) && CommonData.studPassWord.equals(passWord))
                    {
                        StudentMenu studentmenu = new StudentMenu();
                        studentmenu.studentSession(userName);
                    }
                    else if(CommonData.profUserName.equals(userName) && CommonData.profPassWord.equals(passWord)) {
                        ProfessorMenu professorMenu = new ProfessorMenu();
                        professorMenu.professorSession();
                    }
                    else if(CommonData.adminUserName.equals(userName) && CommonData.adminPassWord.equals(passWord)) {
                        AdminMenu admin = new AdminMenu();
                        admin.adminSession();
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
                    Student student = new Student(studId,studName,studEmail,studGen,studDob);
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
