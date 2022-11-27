package StringsBasics;
import java.util.Scanner;
public class ReverseaStrings {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        String rev=reverse(str);
        System.out.println(rev);
    }
    public static String reverse(String str){
            String revStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            revStr=revStr+str.charAt(i);
        }
        return revStr;
    }
}
