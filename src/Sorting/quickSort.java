package Sorting;
import java.util.Arrays;
public class quickSort {
    //apana
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[high];        int i=low-1;
        for (int j=low;j<high;j++){ //small element in starting of the array
            if (arr[j]<pivot){
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // to place pivot in right place
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;//pivit index
    }
    public static void quickSort(int[] arr,int low,int high){
        if (low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        quickSort(arr,0,n-1);
        //print
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//    public static void main(String[] args) {
//        int[] arr={5,4,3,2,1};
//        sort(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
//    }
//    static  void sort(int [] nums,int low ,int hi){
//        if (low>=hi){
//            return;
//        }
//        int s=low ;        int e=hi;
//        int m=s+(e-s)/2;
//        int pivot=nums[m];
//        while(s<=e){  // also a reason why if its already sorted it will not swap
//            while (nums[s]<pivot){
//                s++;
//            }
//            while (nums[e]>pivot){
//                e--;
//            }
//            if (s<=e){
//                int temp=nums[s];
//                nums[s]=nums[e];
//                nums[e]=temp;
//                s++;
//                e--;
//            }
//        }
//        // now my pivot is at correct  index, please sort two halves now
//        sort(nums,low,e);
//        sort(nums,s,hi);
//    }
}
/*lass GFG {
	public static void main (String[] args) {
	    HashMap<Integer,Integer> hm = new HashMap<>();
		int arr[] = {1,6,4,2,7,4,2,3,9,2,8,4};
		int n = arr.length;
		for(int i = 0 ; i< n ; i++){
		    if(hm.containsKey(arr[i])){
		        hm.put(arr[i],hm.get(arr[i])+1);
		    }else{
		        hm.put(arr[i],1);
		    }
		}

		int maxcount = 0 ;
		int res = 0 ;
		for(Map.Entry<Integer,Integer> i : hm.entrySet()){

		    if (maxcount == i.getValue())
            {
                if(i.getKey()>res){
                 res = i.getKey();
                maxcount = i.getValue();
            }
		}

            if (maxcount < i.getValue())
            {
                 res = i.getKey();
                maxcount = i.getValue();
            }
        }
	    System.out.print(res);
	}
}*/