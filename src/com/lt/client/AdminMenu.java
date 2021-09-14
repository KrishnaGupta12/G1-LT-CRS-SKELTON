package com.lt.client;

import java.util.Scanner;

public class AdminMenu {


    public void adminSession() {
        System.out.println("Welcome To Admin. Have a Good day!!");
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
                    System.out.println("Add Professor");
                    break;

                case 2:
                    System.out.println("Approve Student");
                    break;

                case 3:
                    System.out.println("Add course");
                    break;

                case 4:
                    System.out.println("Delete course");
                    break;

                case 5:
                    System.out.println("Generate report cards");
                    break;

                case 6:
                    System.out.println("Edit Course");
                    break;

                case 7:
                    System.out.println("View All Courses");
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
