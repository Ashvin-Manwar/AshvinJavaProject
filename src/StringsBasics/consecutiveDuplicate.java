package StringsBasics;

import java.util.Scanner;

public class consecutiveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();//aabbtttpdf
        System.out.println(removeDuplicates(str));
    }
    public  static String removeDuplicates(String str){
        if (str.length()==0){
            return  " ";
        }
        String ans=""+str.charAt(0);
        for (int i = 0; i <str.length()-1 ; i++) {
            if (str.charAt(i)!=str.charAt(i+1)){
                ans+=str.charAt(i+1);
            }
        }
        return ans;
    }
}
