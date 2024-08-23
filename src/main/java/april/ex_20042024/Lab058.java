package april.ex_20042024;

public class Lab058 {

    public static void main(String[] args) {

        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";
        System.out.println(str3);
        String str4= str1.concat(str2);
        System.out.println(str4);
        // Strings are immutable in nature
        // If you want to change the values
        // Don't use String class -> StringBuilder, StringBuffer. - API,Web Automation

    }
}
