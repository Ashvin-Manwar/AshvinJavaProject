package FunctionMethods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();
//         System.out.println(sum2());
        int ans=sum3(20,233);
        System.out.println(ans);
    }

    /// pass the value of number when you are calling the method in main()
    static  int sum3(int a, int b){
        int sum=a+b;
        return sum;
    }

    private static void sum() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1: ");
        int a= sc.nextInt();// addition o f2 no
        System.out.println("enter number 2: ");
        int b= sc.nextInt();
        int sum=a+b;
        System.out.println(sum);
    }

    // return the value
    static  int sum2(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number 1: ");
        int a= sc.nextInt();// addition o f2 no
        System.out.println("enter number 2: ");
        int b= sc.nextInt();
        int sum=a+b;
       return  sum;
    }
//    /* return type name(){
//    // body
//      return statement;
//      }
//    */
}
