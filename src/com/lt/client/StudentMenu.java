package com.lt.client;
import java.util.*;
public class StudentMenu {
    public void studentSession(String userName) {
        System.out.println("Welcome " +userName + " to your panel. Have a Good day!!");
        System.out.println("------------------------------------------------------------");
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
            switch (task) {
                case 1:
                    System.out.println("Register Course");
                    System.out.println("***************************************************");
                    break;
                case 2:
                    System.out.println("Remove course");
                    System.out.println("***************************************************");
                    break;
                case 3:
                    System.out.println("View Course");
                    System.out.println("***************************************************");
                    break;
                case 4:
                    System.out.println("Pay Fees");
                    System.out.println("***************************************************");
                    break;
                case 5:
                    System.out.println("Update Profile");
                    System.out.println("***************************************************");
                    break;
                case 6:
                    System.out.println("Exit");
                    System.out.println("***************************************************");
                    System.exit(0);
                default:
                    System.out.println("No task for the day");
            }
        }
    }
}