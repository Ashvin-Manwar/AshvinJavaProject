package Sorting;
import java.util.*;
import java.util.Scanner;

public class BubbleSorts {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++)
            // arr[i] = sc.nextInt();
        int arr[] = {7, 8, 1, 3, 2};
        // bubbleSort(arr);
        bubble(arr);
        // System.out.println(Arrays.toString(arr));// both are working
        printArray(arr);
 
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void bubble(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }
 
    // public static void bubbleSort(int[] arr) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         for (int j = 0; j < arr.length - i - 1; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 //swap
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    //     printArray(arr);
    // }
 
}

































    // static final int NO_OF_CHARS = 256;

    // // finds the second most frequently occurring
    // // char
    // static char getSecondMostFreq(String str)
    // {
    //     // count number of occurrences of every
    //     // character.
    //     int[] count = new int[NO_OF_CHARS];
    //     int i;
    //     for (i=0; i< str.length(); i++)
    //         (count[str.charAt(i)])++;

    //     // Traverse through the count[] and find
    //     // second highest element.
    //     int first = 0, second = 0;
    //     for (i = 0; i < NO_OF_CHARS; i++)
    //     {
    //         /* If current element is smaller than
    //         first then update both first and second */
    //         if (count[i] > count[first])
    //         {
    //             second = first;
    //             first = i;
    //         }

    //         /* If count[i] is in between first and
    //         second then update second  */
    //         else if (count[i] > count[second] &&
    //                 count[i] != count[first])
    //             second = i;
    //     }

    //     return (char)second;
    // }

    // // Driver program to test above function
    // public static void main(String args[])
    // {
    //     String str = "geeksforgeeks";
    //     char res = getSecondMostFreq(str);
    //     if (res != '\0')
    //         System.out.println("Second most frequent char"+
    //                 " is " + res);
    //     else
    //         System.out.println("No second most frequent"+
    //                 "character");
    // }
   
//*
// import java.io.*;
//
//import java.util.*; // contains Collections framework

//class Main {
//
//static int upperBound(int arr[], int num){
//
//int l = 0, r = arr.length-1;
//
//int ans = r;
//
//while(l<=r){
//
//int mid = (l+r)/2;
//
//if(arr[mid]>=num){
//
//ans = mid;
//
//r = mid-1;
//
//}else{
//
//l = mid+1;
//
//}
//
//}
//
//return ans;
//
//}
//
//static int lowerBound(int arr[], int num){
//
//int l = 0, r = arr.length-1;
//
//int ans = 0;
//
//while(l<=r){
//
//int mid = (l+r)/2;
//
//if(arr[mid]<=num){
//
//ans = mid;
//
//l = mid+1;
//
//}else{
//
//r = mid-1;
//
//}
//
//}
//
//return ans;
//
//}
//
//public static void main (String[] args) {
//
//int L,R;
//
//Scanner sc = new Scanner(System.in);
//
//int N = sc.nextInt();
//
//int Q = sc.nextInt();
//
//int arr[] = new int[N];
//
//for(int i=0;i<N;i++){
//
//arr[i]=sc.nextInt();
//
//}
//
//Arrays.sort(arr);
//
//while(Q-->0){
//
//int l = sc.nextInt();
//
//int r = sc.nextInt();
//
//int lb = upperBound(arr, l);
//
//int up = lowerBound(arr, r);
//
//int diff = up-lb;
//
//if(diff<0) diff = -1;
//
//System.out.println(diff+1);
//
//}
//
//}
//
//}*/