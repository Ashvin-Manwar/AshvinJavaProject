package Matrix;

import java.util.Scanner;

public class matrix_practice {
  public static void main(String[] args) {
         boolean flag=true;
        int row,cols;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of row: ");
        row=sc.nextInt();
        System.out.println("enter the no of cols: ");
        cols=sc.nextInt();
        int [][] arr=new int[row][cols];
        if (row!=cols)
            System.out.println("MAtrix is not identity Matrix");
        else{
            System.out.println("enter elements of matrix");
            for (int i=0;i<row;i++){
                for (int j=0;j<cols;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            for (int i=0;i<row;i++){
                for (int j=0;j<cols;j++){
                if (i==j && arr[i][j]!=1)
                {
                    flag=false;
                    break;
                }
                if (i!=j && arr[i][j]!=0)
                {
                    flag=false;
                    break;
                }
                }
            }
            if (flag)
                System.out.println("Identity matrix");
            else
                System.out.println("NOt identical");
        }
    }
}
