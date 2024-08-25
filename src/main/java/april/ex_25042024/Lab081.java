package april.ex_25042024;

import java.util.Scanner;

public class Lab081 {

    public static void main(String[] args) {

        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser name!!, In which want to execute the program!");

        String browserName = scanner.nextLine();
        browserName = browserName.toLowerCase();

        switch(browserName){

            case "chrome":
                System.out.println("Starting the chrome browser");
                   break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                break;

            case "opera":
                System.out.println("Starting the opera browser");
                break;

            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have not idea which browser is this");
                break;
        }

        System.out.println("Program executed sucessfully in the "+browserName+ " browser");

    }
}
