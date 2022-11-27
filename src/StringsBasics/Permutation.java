package StringsBasics;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        System.out.println(isPerm(str1,str2));

    }
    public static  boolean isPerm(String str1,String str2){
        int[] count =new int[26];
        for (int i = 0; i <str1.length() ; i++) {
            char x=str1.charAt(i);
            int index=x-'a';
            count[index]+=1;
        }
        for (int i = 0; i <str2.length() ; i++) {
            char x=str2.charAt(i);
            int index=x-'a';
            count[index]-=1;
        }
        for (int i = 0; i < count.length ; i++) {
            if (count[i]!=0)
                return false;
        }
        return true;
    }
}
//abfg gabf
//true
