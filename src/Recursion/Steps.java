package Recursion;

import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(numberOfSteps(n));
    }
    public static int numberOfSteps(int num){
        return  helper(num,0);
    }
    private static int helper(int num,int steps){
        if (num==0){
            return  steps;
        }
        if (num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}
