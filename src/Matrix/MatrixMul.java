package Matrix;

import java.util.Scanner;
public class MatrixMul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and column for first mat1");
        int row = sc.nextInt();
        int coln = sc.nextInt();
        int[][] mat1 = new int[row][coln];
        //input
        System.out.println("enter input for first mat");
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter row and column for s second mat2");
        int row2 = sc.nextInt();
        int coln2 = sc.nextInt();
        int[][] mat2 = new int[row2][coln2];
        //input
        System.out.println("enter input for second mat2");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                mat2[i][j] = sc.nextInt();
            }
        }
        // logoc
        if (coln != row2){
            System.out.println("invalid input");
        return;
        }
        int[][] prod=new int[row][coln2];
        for (int i = 0; i < prod.length; i++) {
            for (int j = 0; j < prod[0].length; j++) {
                for (int k=0;k<coln ;k++){
                    prod[i][j]+=mat1[i][k]*mat2[k][j];
                }
            }
        }

        // output display
        System.out.println("Resultant matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<coln2;j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }
    }
}
