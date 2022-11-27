package Matrix;

import java.util.Scanner;

public class matrix_prac_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];// initialisation
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]= sc.nextInt(); // taking input from user
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (arr[i][j]==1){
                    for (j=0;j<n;j++)
                    System.out.print("1 ");
            }else System.out.print("0");
            }
            System.out.println();
        }

    }
}
   /* public static void main(String[] args) {
        // 90 clock rotate
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr=new int[n][n];// initialisation
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]= sc.nextInt(); // taking input from user
            }
        }
        //   1  first step transpose ff matrix
        System.out.println("transpose ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");// swap ( arr[i][j], arr[j][i])
            }
            System.out.println();
        }
        // swap ( arr[i][j], arr[j][i])
   /* for (int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
           arr[j][i]=temp;
        }
    }
*/
 /*       System.out.println("rotate 90 clockwise");
        // step 2 flip horizontaly   swap (arr[i][j], arr[i][n-1-j])
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[n-1-j][i]+" ");''
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
            //   System.out.println();
        }
        // Step 2 =swap (arr[i][j], arr[n-1-i])  90 clockwise
      /*  for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[n-1-j][i]+" ");
            }
            System.out.println();
        }
 /*   for (int i=0;i<n;i++){       // swap (arr[i][j], arr[i][n-1-j])
        for (int j=0;j<n/2;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[n-1-j][i];
            arr[n-1-j][i]=temp;
        }
    }
    */

