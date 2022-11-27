package Arrays;
import java.util.*;
public class ReverseAnything {
    public static void main(String[] args) {
      //reverse a string
        String str="123456";
        System.out.println(str);
        char arr[] = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            swap(arr, p1, p2);
            p1++;
            p2--;
        }
        System.out.println(Arrays.toString(arr));
        String ans = String.valueOf(arr);
        System.out.println(ans);

    }
    static void reverseArray(int[] arr){
        // reverse an array
         int arr1[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr1));
        int n=arr.length;
        int p1=0; int p2=n-1;
        while(p1<p2){
            swap(arr,p1,p2);
            p1++;
            p2--;
        }
        System.out.println(Arrays.toString(arr1));

    }
    static  void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void swap(char arr[], int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
