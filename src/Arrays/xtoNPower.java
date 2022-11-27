package Arrays;

import java.util.Scanner;

public class xtoNPower {
    public static void main(String[] args) {
        try (Scanner sc= new Scanner(System.in)) {
            double x=sc.nextInt();
            int n= sc.nextInt();
            System.out.println(myPower(x,n));
        }
    }
    public static double myPower(double x,int n){
        double ans=1.0;
        long num=n;
        if (num<0)
            num=-1*num;
        while(num>0){
            if (num%2==1){
                ans*=x;
                num-=1;
            }else {
                x*=x;
                num/=2;
            }
        }
        if (n<0)
            ans=(double) (1.0)/(double) (ans);
        return ans;
    }
}
