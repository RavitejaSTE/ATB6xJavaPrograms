package april.ex_25042024;

import java.util.Scanner;

public class Lab091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();

        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are listed below...");
        System.out.println("Your Name is "+name);
        System.out.println("Your Age is " +age);
        System.out.println("Your Salary is " +salary);

        sc.close();


    }
}
