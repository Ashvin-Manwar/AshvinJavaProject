package StringsBasics;
import java.util.Scanner;
public class CountChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        countCharacter(str);

    }

    private static void countCharacter(String str) {
            int[] count =new int[26];
        for (int i = 0; i <str.length() ; i++) {
            char x=str.charAt(i);
            int index=x-'a';
            count[index]+=1;
        }
        for(int i=0;i< count.length;i++){
            if (count[i]!=0){
                char ans=(char) (i+'a');
                System.out.println(ans+": "+count[i]);
            }
        }
    }
}
/*aabccduuff
a: 2
b: 1
c: 2
d: 1
f: 2
u: 2
* */
