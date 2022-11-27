package Matrix;
import java.io.*;
public class BooleanMatrixC {
    static int MAX = 1000;
    static int a[][] = new int[MAX][MAX];

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            boolean b[] = new boolean[n];
            for(int i=0;i<n;i++){
                str = br.readLine().trim().split(" ");
                for(int j=0;j<m;j++){
                    a[i][j] = Integer.parseInt(str[j]);
                    if(a[i][j]==1){
                        b[i]=true;
                    }
                }
            }
            for(int i = 0; i < n; i++){
                if(b[i]){
                    for(int j = 0; j < m; j++){
                        System.out.print("1 ");
                    }
                }
                else{
                    for(int j = 0; j < m; j++){
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
}
// my program
/* public static void main (String[] args) {
                      // Your code here
                      Scanner sc=new Scanner(System.in);
                      int t=sc.nextInt();
    while(t-->0){
                      int rowm=sc.nextInt();
                      int coln=sc.nextInt();
                      int[][] mat=new int[rowm][coln];
                      boolean b[]=new boolean[rowm];
                      //input
                      for(int i=0;i<rowm;i++){
                          for(int j=0;j<coln;j++){
                          mat[i][j]=sc.nextInt();
                          }
                      }

                      for(int i=0;i<rowm;i++){
                          for(int j=0;j<coln;j++){
                           if( mat[i][j] ==1){
                               b[i]=true;
                            }
                        }
                      }
                            for(int i=0;i<rowm;i++){
                                if(b[i]){
                          for(int j=0;j<coln;j++){
                               System.out.print("1 ");
                                 }
                               }else{
                                for(int j=0;j<coln;j++){
                               System.out.print("0 ");
                                 }
                            }
                            System.out.println();
                            }
    }

}
}*/
