package Recursion;

public class recursion {
    public static int multiplydigit(int n){
       int product=1;
       while(n>0){
           int r=n%10;
           product*=r;
           n/=10;
       }
        return product;
    }

    public static void main(String[] args) {
        int n=1234;
        int product=multiplydigit(n);
        System.out.println(product);
    }
//    public static void printNumb(int n){
//        if(n==0) {// 1st
//        if(n==6){//2nd
//            return;
//        }
//        System.out.println(n);
//        printNumb(n+1);//2nd
//        printNumb(n-1);//ist
//    }
//    public static void main(String[] args) {
//        int n=5;//1st
//        int n=1;
//        printNumb(n);
//    }
    /*public static void printSum(int i,int n,int sum){
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);
    }
public static void main(String[] args) {
    printSum(1,5,0);
}
*/
 /*public static int calcfactorial(int n){
    if (n==0 || n==0){
        return 1;
    }
    int fact_nm1=calcfactorial(n-1);
    int fact_n=n*fact_nm1;
    return fact_n;
}

    public static void main(String[] args) {
        int n=5;
        int ans=calcfactorial(n);
        System.out.println(ans);
    }
*/
    /*  // fibonacci series
public static void printFib(int a,int b,int n){
    if (n==0){
        return;
    }
    int c = a + b;
    System.out.println(c);
    printFib(b,c,n-1);
}
   public static void main(String[] args) {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        printFib(a,b,n-2);
    }
*/
        //power
 /*   public static  int calcPower(int x,int n){
        if (n==0){//base case 1
            return 1;
        }
        if (x==0){//base case 2
            return 0;
         }
        int xPownm1=calcPower(x,n-1);//kaam
        int xPown=x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
*/
    // nlog
//public static  int calcPower(int x,int n){
//    if (n==0){//base case 1
//        return 1;
//    }
//    if (x==0){//base case 2
//        return 0;
//    }
//    if(n%2==0)// if nis even
//        return calcPower(x,n/2)*calcPower(x,n/2);
//    else
//        return calcPower(x,n/2)*calcPower(x,n/2)*x;
//}
//
//    public static void main(String[] args) {
//        int x=2,n=5;
//        int ans=calcPower(x,n);
//        System.out.println(ans);
//    }




}
