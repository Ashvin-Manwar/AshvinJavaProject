package Matrix;

public class WaveTraversal {
    public static void main(String[] args) {
        //1d array wavepattern of unsorted array
        int arr[] = {10, 90, 49, 2, 1, 5, 23};
        int n = arr.length;
//        System.out.println(sortWave(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
         static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
        }
//       public static void sortWave(int[] arr,int n){
//            Arrays.sort(arr,arr+n);
//        for (int i=0;i<n-1;i++){
//            swap(arr[i],arr[i+1]);
//        }
//        }


//        sum of odd array
      /*  public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int ans=countOddSum(arr,n);
            System.out.println(ans);
        }
        public static int countOddSum(int arr[],int n){
            int count=0;
            for(int i=0;i<arr.length;i++){
                int sum=0;
                for(int j=i;j<arr.length;j++){
                    sum+=arr[j];
                    if(sum%2!=0){
                        count++;
                    }
                }
            }
            return count;
        }
                */

//        Scanner sc=new Scanner(System.in);
//        int n= sc.nextInt();
//        int m=sc.nextInt();
//        int[][] arr=new int[n][m];
//        for (int i=0;i< arr.length;i++){
//            for (int j=0;j< arr[0].length;j++){
//                arr[i][j]= sc.nextInt();
//            }
//        }
//        for (int j=0;j< arr[0].length;j++){
//            if (j%2==0){
//                for (int i=0;i< arr.length;i++){
//                    System.out.print(arr[i][j]+" ");
//                }
//            }else {
//                for (int i=0;i< arr.length-1;i++){
//                    System.out.println(arr[i][j]+" ");
//                }
//            }
//            System.out.println();
//        }

}
