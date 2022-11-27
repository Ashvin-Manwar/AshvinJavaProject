package Matrix;

import java.util.*;
public class BoundaryTraversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int row=sc.nextInt();
            int cols=sc.nextInt();
            int [][] numbers=new int[row][cols];
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    numbers[i][j]=sc.nextInt();
                }
            }
            //output
            for(int i=0;i<row;i++){
                for(int j=0;j<cols;j++){
                    if(i==0||j==0 ||i==(row-1)|| j==(cols-1))
                        System.out.print(numbers[i][j]+" ");
                    else
                        System.out.print(" "+" ");
                }
                System.out.println();
            }

        }
    }

}
/*
*   //special condition
                     if(row==1|| cols==1){ // only row or column is there then
                       for(int i=0;i<row;i++){
                           for(int j=0;j<cols;j++){
                               System.out.print(numbers[i][j]+" ");
                            }
                        }
                        System.out.println();
                        continue;
                     }
                     *
                     *  // 1sr row left to right
                        for(int i=0;i<cols;i++)
                            System.out.print(numbers[0][i]+" ");
                        //last cols
                        for(int i=1;i<row;i++)
                              System.out.print(numbers[i][cols-1]+" ");
                        //last row
                        for(int i=cols-2;i>=0;i--)
                                System.out.print(numbers[row-1][i]+" ");
                        //bottom to top column
                        for(int i=row-2;i>=1;i--)
                            System.out.print(numbers[i][0]+" ");

                        System.out.println();

*/
/* boundarytravesal clockwise
* import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
class Main {
    public static void main (String[] args) {
                      // Your code here
                      Scanner sc= new Scanner(System.in);
                      int t=sc.nextInt();
                      while(t-->0){
                      int row=sc.nextInt();
                      int cols=sc.nextInt();
                       int [][] numbers=new int[row][cols];
                       for(int i=0;i<row;i++){
                           for(int j=0;j<cols;j++){
                               numbers[i][j]=sc.nextInt();
                           }
                       }
                       //special condition
                     if(row==1|| cols==1){
                       for(int i=0;i<row;i++){
                           for(int j=0;j<cols;j++){
                               System.out.print(numbers[i][j]+" ");
                            }
                        }
                        System.out.println();
                        continue;
                     }
                        // 1sr row left to right
                        for(int i=0;i<cols;i++)
                            System.out.print(numbers[0][i]+" ");
                        //last cols
                        for(int i=1;i<row;i++)
                        System.out.print(numbers[i][cols-1]+" ");
                        //last row
                        for(int i=cols-2;i>=0;i--)
                        System.out.print(numbers[row-1][i]+" ");
                        //bottom to top column
                        for(int i=row-2;i>=1;i--)
                        System.out.print(numbers[i][0]+" ");

                        System.out.println();
                      }
 }
}*/