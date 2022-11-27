package Arrays;
import java.util.*;
public class EasyLevel1DSA {
    //1: Find all pairs whose elements sum is equal to the target sum.
    //input: {1 2 3 4 5 6}    int k = 7;
    //Output: {1,6} {2,5} {3,4}.
    // public class NewtonSchool {
        public static void main(String[] args) {
//            int []a = {2,45,7,3,5,1,8,9};
// 3, 7
//8, 2
//9, 1
            int[] a= {1, 2, 3, 4, 5, 6} ;
             printSumPairs(a,7);

        }
        public static void printSumPairs(int []input, int k){
            Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

            for(int i=0;i<input.length;i++){
                if(pairs.containsKey(input[i]))
                    System.out.println(input[i] +", "+ pairs.get(input[i]));
                else
                    pairs.put(k-input[i], input[i]);
            }

        }
    }
//            int[] arr={2,1,2,3,3,4,4,4};
//            int max=Integer.MIN_VALUE;
//            // int max1=Integer.MIN_VALUE;
//            for(int i=0;i<arr.length;i++){
//                if (max<arr[i])
//                    max = arr[i];
//            }
////            for (int i=0;i< arr.length;i++){
////                if (max!=arr[i])
////                    max1=arr[i];
////            }
////            System.out.println(max1);
//        }
//     }

