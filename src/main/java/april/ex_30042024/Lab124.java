package april.ex_30042024;

import java.util.Scanner;

public class Lab124 {
    public static void main(String[] args) {

        // Program to Perform Arithmetic Operations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input num 1");
        int input1 = sc.nextInt();
        System.out.println("Enter input num 2");
        int input2 = sc.nextInt();
        System.out.println("Enter any one of the Arithmetic Operator + - * % / ");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Result: "+(input1+input2));
                break;
            case '-':
                System.out.println("Result: "+(input1-input2));
                break;
            case '*':
                System.out.println("Result: "+(input1*input2));
                break;
            case '%':
                System.out.println("Result: "+(input1%input2));
                break;
            case '/':
                System.out.println("Result: "+(input1/input2));
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
