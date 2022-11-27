package Arrays;
//https://practice.geeksforgeeks.org/problems/find-missing-and-repeating2512/1?page=1&difficulty[]=0&difficulty[]=1&category[]=Arrays&category[]=Hash&category[]=Sorting&category[]=Searching&sortBy=submissions
// import java.util.Scanner;

public class dssmedMock {
    public static void main(String[] args) {
        int arr[] = {7, 3, 4, 5, 5, 6, 2};
        int n = arr.length;
        printTwoElements(arr, n);
    }

    private static void printTwoElements(int[] arr, int n) {
        int i;
        for ( i = 0; i < n; i++) {
            int abs_val = Math.abs(arr[i]);
            if (arr[abs_val - 1] > 0)
                arr[abs_val - 1] = -arr[abs_val - 1];
            else
                System.out.println(abs_val);
        }
            for (i = 0; i < n; i++) {
                if (arr[i] > 0)
                    System.out.println(i + 1);
            }

    }


//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i = 0; i < arr.length ; i++) {
//            arr[i]=sc.nextInt();
//        }
//        int[] arr={22,22 ,1 ,9 ,4 ,6,35,35,99};
//        int max=Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i]>max){
//                max=arr[i];
//            }
//        }
//        for(int i=0;i<arr.length;i++){
//            if( max2<arr[i] && arr[i]!=max)
//                   max2=arr[i];
//               }
////        for (int i = 0; i < arr.length ; i++) {
////            if (max!=arr[i]){
////                max2=arr[i];
////            }
////        }
//        System.out.println(max2);
//        System.out.println();
//    }
}
