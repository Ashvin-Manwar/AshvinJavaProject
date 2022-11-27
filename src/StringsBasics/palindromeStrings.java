package StringsBasics;

import java.util.Scanner;

public class palindromeStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if (str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
