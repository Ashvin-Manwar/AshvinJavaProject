package Sorting;

import java.util.*;

public class selectionSorts {
    public static void main(String[] args) {
        // smalestelement to righ tplace
        // complexity  best o(n^2)
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++)
//            arr[i] = sc.nextInt();
        int[] arr={4,2,6,5,12};
        // selectinSort(arr);
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray(int[] arr){
        for (int i = 0; i <arr.length; i++)
            System.out.print(arr[i] +" ");
        System.out.println();
    }

//    public static int selectionSort(int[] arr,int n){
//        for (int i=0;i<n-1;i++){
//            int minIndex=i;
//            for (int j=i+1;j<n;j++){
//                if (arr[j]<arr[minIndex])
//                    minIndex=j;
//            }
////            swap(arr[minIndex],arr[i]);
//        }
//        return n;
//
//     //apana  college
// //    / time complexity= o(n^2)
//     public  static void selectinSort(int[] arr){
//         for(int i=0; i<arr.length-1; i++) {
//             int smallest = i;
//             for(int j=i+1; j<arr.length; j++) {
//                 if(arr[j] < arr[smallest]) {
//                     smallest = j;
//                 }
//             }
//             //swap
//             int temp = arr[smallest];
//             arr[smallest] = arr[i];
//             arr[i] = temp;
//         }

//         printArray(arr);
//     }

//kunal
static void selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        // find the max item in the remaining array and swap with correct index
        int last = arr.length - i - 1;
        int maxIndex = getMaxIndex(arr, 0, last);
        swap(arr, maxIndex, last);
    }
}

static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
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
}
