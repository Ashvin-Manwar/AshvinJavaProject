package Matrix;

public class MultiDimension {
    public static void main(String[] args) {
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9*/
//        int[][] arr= new int[3][];
        int[][] arr={
                {1,2,3,4},
                {5,6},
                {7,8,9,10}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        //input
//        int[][] arr = new int[3][3];
//        Scanner sc= new Scanner(System.in);
//        System.out.println(arr.length);// no of row
//        for (int row = 0; row < arr.length; row++) {
//            // for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                arr[row][col] = sc.nextInt();
//            }
//        }
        //output
//        for (int row = 0; row < arr.length; row++) {
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//            }s
//            System.out.println();
//        }
        // output
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//    }
            // output
//        for (int[] a: arr){// enhance for loop for(int)
//            System.out.println(Arrays.toString(a));
//        }
}
}
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                    arr[i][j];
//            }
//        }
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                System.out.println( arr[i][j]+" ");
//            }
//        }
//
//    }
//}
