package Sorting;
// stable
// used in smalle rvalue of N
import java.util.Arrays;
public class insersionSort {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        int arr[] = {7, 8, 1, 3, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        // insersionSorts(arr);
    }


    // Kunal
    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Apana College
    // public  static void insersionSorts(int[] arr){
    //     for(int i=1; i<arr.length; i++) {
    //         int current = arr[i];
    //         int j = i - 1;
    //         while(j >= 0 && arr[j] > current) {
    //             //Keep swapping
    //             arr[j+1] = arr[j];
    //             j--;
    //         }
    //         arr[j+1] = current;
    //     }
    //     printArray(arr);
    // }

    // public static void printArray(int arr[]){
    //     for (int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    
}
