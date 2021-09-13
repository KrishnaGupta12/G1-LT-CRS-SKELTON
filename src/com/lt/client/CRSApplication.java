
package com.lt.client;

        import com.lt.bean.Student;

        import java.util.Scanner;

public class CRSApplication {
    public static void main(String[] args) {
        System.out.println("Welcome to CRSApplication");
        System.out.println("1. Admin");
        System.out.println("2. Student");
        System.out.println("3. Professor");
        Boolean permission = true;
        while(permission)
        {
            System.out.println("Choose your role");
            Scanner sc =new Scanner(System.in);
            int role = sc.nextInt();
            switch(role) {
                case 1:
                    System.out.println("Admin");
                    AdminMenu admin = new AdminMenu();
                    admin.adminSession();
                    break;

                case 2:
                    System.out.println("Student");
                    StudentMenu studentmenu = new StudentMenu();
                    studentmenu.studentSession();
                    break;

                case 3:
                    System.out.println("Professor");
                    ProfessorMenu professorMenu = new ProfessorMenu();
                    professorMenu.professorSession();
                    break;




                default:
                    System.out.println("Invalid Role Chosen");
            }
        }
        System.out.println("");


    }
}
