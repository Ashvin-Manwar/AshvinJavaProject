package Arrays;
import java.util.*;
import java.util.Arrays;

public class Patterns {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 3, 2, 1};
//        bubble(arr);
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void bubble(int[] arr){
        boolean swapped = false;
        for (int i = 0; i < arr.length ; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }
    static void selection(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        System.out.println(pattern);
//        int n = 5;
//        for (int i = 0; i < n; i++) {//n*n box
//            for (int j = 0; j <n ; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }/*  *****
//         ****
//         ***
//         **
//         *
//        */
//2
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        *
//        **
//        ***
//        ****
//        *****


}