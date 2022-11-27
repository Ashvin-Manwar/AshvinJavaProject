package StringsBasics;

import java.util.Scanner;

public class countWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();// this is a sunny day
        System.out.println(countWord("this is a sunny day"));
    }
    public static int countWord(String str){
        if (str.length()==0){
            return 0;
        }
        int count=0;
        boolean a=true;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' '){
                a=true;
            }else if (a==true){
                a=false;
                count++;
            }
        }
        return count;
    }
}
