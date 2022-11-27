package Sorting;

public class mergeSort {
//    public static  void  conquer(int arr[],int si,int mid, int ei){
//        int merged[]=new int[ei-si+1];
//        int idx1=si;        int idx2=mid+1;
//        int x=0;
//        //0(n)
//        while(idx1<=mid && idx2 <=ei){
//            if(arr[idx1]<=arr[idx2]){
//                merged[x++]=arr[idx1++];
//            }else {
//                merged[x++]=arr[idx2++];
//            }
//        }
//        while(idx1<=mid){
//            merged[x++]=arr[idx1++];
//        }
//        while (idx2<=ei){
//            merged[x++]=arr[idx2++];
//        }
//        for (int i=0,j=si;i< merged.length;i++,j++){
//            arr[j]=merged[i];
//        }
//    }
//    public static void  divide(int arr[],int si,int ei){
//        if (si>=ei){
//            return;
//        }
//        int mid=si+(ei-si)/2;// (si+ei)/2 not  to use
//        divide(arr,si,mid);
//        divide(arr,mid+1,ei);
//        conquer(arr,si,mid,ei);
//    }
//    public static void main(String[] args) {
//        int arr[]={6,3,9,5,2,8,};
//        int n= arr.length;
//        divide(arr,0,n-1);
//        // print
//        for (int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }

    //babbar
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int[] arr=new int[n];// 2 5 1 6 9
//        for (int i=0 ;i<arr.length;i++)
//            arr[i]=sc.nextInt();
//         int ans=merge(arr,0,n-1);
        int[] arr={5,4,3,2,1};

//        System.out.println(Arrays.toString(merge(arr,0, arr.length)-1));
    }

//        System.out.println(Arrays.toString(arr));

    public static void merge(int[] arr,int s,int e){
        int mid=s+(e-s)/2;
        int len1=mid-s+1;
        int len2=e-mid;
        int[] first=new int[len1];
        int[] second=new int[len2];
        // copy value
        int mainArrayIndex=s;
        for (int i=0;i<len1;i++){
            first[i]=arr[mainArrayIndex++];
        }
        mainArrayIndex=mid+1;
        for (int i=0;i<len2;i++){
            second[i]=arr[mainArrayIndex++];
        }
        // merge 2 sorted arrays
        int index1=0;
        int index2=0;
        mainArrayIndex=s;
        while (index1<len1 && index2<len2){
            if (first[index1]<second[index2]){
                arr[mainArrayIndex++]=first[index1++];
            }else {
                arr[mainArrayIndex++]=second[index2++];
            }
        }
        while(index1<len1){
            arr[mainArrayIndex++]=first[index1++];
        }
        while(index2<len2){
            arr[mainArrayIndex++]=first[index2++];
        }

    }
    public static void mergeSort(int[] arr,int s,int e){
        // basae case
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        //left part sorting
        mergeSort(arr,s,mid);
        // right part sorting
        mergeSort(arr,mid+1,e);
        //merge
        merge(arr,s,e);
    }
}
