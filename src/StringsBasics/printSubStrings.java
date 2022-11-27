package StringsBasics;

import java.util.Scanner;

public class printSubStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        subStrings(str);

    }
    public  static void subStrings(String str){
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String str1=str.substring(i,j);
                System.out.println(str1);
            }
        }
    }
}
