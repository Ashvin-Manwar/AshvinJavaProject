package FunctionMethods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//    String message=greet();
//        System.out.println(message);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name=sc.nextLine();
    String personalised = myGreet(name);
        System.out.println(personalised);

    }

    private static String myGreet(String name) {
        String message="Hellow " +name;
        return message;
    }

    static String greet(){
        String greeting= "How are you";
        return greeting;
    }
}
