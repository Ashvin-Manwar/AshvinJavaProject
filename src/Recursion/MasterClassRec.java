package Recursion;

public class MasterClassRec {//fibonacy , power,factorial
    public static void main(String[] args) {
//        int ans=fact(5);
//        int ans=power(2,5);
//        int ans=fib(6);
        int[] arr={5,6,7,8,9,88};
//        int ans=sum(arr,0);
        int ans=max(arr,0);
        System.out.println(ans);
    }
    public static int max(int[] arr,int start){
        if (start== arr.length){
            return Integer.MIN_VALUE;
        }
        int assumption=max(arr, start+1);
//        if (assumption>arr[start]){
//            return assumption;
//        }else {
//            return arr[start];
//        }
        return Math.max(arr[start],assumption);
    }

    public static int sum(int[] arr,int start){
        if (start == arr.length){
            return 0;
        }
        int assumption=sum(arr, start+1);
        int ans=arr[start]+assumption;
        return ans;

    }
    public static int fib(int n){
        if (n==0 || n==1){
            return  n;
        }
        int assum1=fib(n-1);
        int assum2=fib(n-2);
        int ans=assum1+assum2;
        return ans;
    }
    public static int power(int x,int n) {
        if (n==0) {
            return 1;
        }
        int assumption = power(x,n-1 );
        int ans=x*assumption;
        return ans;
    }

    public static  int fact(int n){
        if (n==1) {// base case
            return 1;
        }
        int assumption=fact(n-1);// assumption
        int ans=n*assumption;
        return ans;

    }
}
