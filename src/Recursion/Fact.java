package Recursion;

public class Fact {
    public static void main(String[] args) {
//        int ans = fact(5);
//        System.out.println(ans);
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        }        System.out.println(n);
        print(n+1);
    }
//    static int fact(int n){
//        if (n<=1){
//            return  1;
//        }
//        return n*fact(n-1);
//    }
}
