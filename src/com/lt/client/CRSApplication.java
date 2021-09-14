
package com.lt.client;

import com.lt.bean.Professor;
import com.lt.bean.Student;
import com.lt.bean.User;
import com.lt.business.ProfessorImplService;
import com.lt.business.StudentImplService;
import com.lt.constants.CommonData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static com.lt.dao.ProfessorDao.professorMap;
import static com.lt.dao.StudentDao.map;

public class CRSApplication {
    public static void main(String[] args) throws ParseException {
        StudentImplService studentImplService = new StudentImplService();
        ProfessorImplService professorImplService = new ProfessorImplService();


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
                    System.out.println("Login");
                    System.out.println("-----------------------------------------------");
                    System.out.println("Enter UserName : ");
                    String userName = sc.next();
                    System.out.println("Enter Password : ");
                    String passWord = sc.next();
                    Student std = map.get(userName) ;
                    Professor professor = professorMap.get(userName);


                    User user = new User(userName,passWord);

                    if(std!=null && std.getStudentEmail().equals(userName) && std.getPassWord().equals(passWord))
                    {
                        StudentMenu studentmenu = new StudentMenu();
                        studentmenu.studentSession(std.getStudentName());
                    }
                    else if(professor.getProfessorEmail().equals(userName) && professor.getPassWord().equals(passWord))
                    {
                        ProfessorMenu professorMenu = new ProfessorMenu();
                        professorMenu.professorSession(professor.getProfessorName());
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
                    System.out.println("Enter your New PassWord: ");
                    String stdPassword = sc.next();

                    System.out.println("Enter your Gender: ");
                    String studGender = sc.next();
                    char studGen = studGender.charAt(0);
                    System.out.println("Enter your DOB: ");
                    String studDobs = sc.next();
                    Date studDob=new SimpleDateFormat("dd/MM/yyyy").parse(studDobs);
                    Student student = new Student(studId,studName,studEmail,studGen,studDob,stdPassword);
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
