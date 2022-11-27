package BinarySearch;

public class  binarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target =18;// 75;//-1       ///18;//9
        int ans = binarySearchs(arr, target);
        System.out.println(ans);
    }

    
    public static int binarySearchs(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
}
//public class Binaru_Search {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) { // initialisation
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("enter the elment to be search");
//        int x = sc.nextInt();
//        int ans = numberOfTimesRotation(arr);
//        if (ans!=-1){
//            System.out.println("the no of times array rotate :"+ ans);
//        }else{
//            System.out.println("array is not rotate");
//        }
//        System.out.println(ans);
//        int n = 6;
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }
//    }

//    public static int numberOfTimesRotation(int[] arr) {
//        int start = 0;        int end = arr.length - 1;
//        while (start < end) {
//            int mid = (start + end) / 2;
//            if ( mid-1 >= 0 && arr[mid] < arr[mid-1]) {
//                return mid;
//            }
//            if (mid+1< arr.length  && arr[mid] > arr[mid + 1]) {
//                return mid + 1;
//            }
//            if (arr[mid] > arr[end]) {
//                start = mid + 1;
//            } else if (arr[mid] < arr[end]) {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//}


//    public int mySqrt(int x) {
////    Suare root using binary search
//       int start=1;
//       int end=x;
//        while(start<=end){
//            int mid =start+(start-end)/2;
//            if (mid<=x/mid) start=mid+1;
//            else end=mid-1;
//           }
//        return end;
//   }
//}

/*       int[] arr = {2, 5, 7, 8,9, 12, 14, 16, 17, 19, 20, 24, 28};
       int srch = 16;
       int li = 0;  // lower index
       int hi = arr.length - 1; //high
       int mi = (li + hi) / 2;// midd
   while(li<=hi)
   {
       if (arr[mi] == srch) {
           System.out.println("elementis at" + " "+  mi+" " + "index position");
           break;
       } else if (arr[mi] < srch) {
           li = mi + 1;
       } else {
           hi = mi - 1;
       }
       mi = (li + hi) / 2;
   }
   if (li>hi){
       System.out.println("element not found");
   }
   }
}/*
 user input
       Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        for (int i=0;i<n;i++){ // initialisation
            arr[i]= sc.nextInt();
        }

                */
    //KUNAL
    // return the index
    // return -1 if it does not exist
//    static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                return mid;   // ans found
//            }
//        }
//        return -1;
//    }

