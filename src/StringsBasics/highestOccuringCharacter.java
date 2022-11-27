package StringsBasics;

import java.util.Scanner;

public class highestOccuringCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        highestOccuringChar(str);
    }
    private static void highestOccuringChar(String str) {
        int[] count =new int[26];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <str.length() ; i++) {
            char x=str.charAt(i);
            int index=x-'a';
            count[index]+=1;
        }
        for(int i=0;i< count.length;i++){
            if (count[i]>max)
                max=count[i];
            }
            System.out.println(max);
    }
}
