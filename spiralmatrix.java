import java.net.SocketTimeoutException;
import java.util.*;

public class spiralmatrix{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter number of columns:");
        int m = sc.nextInt();
        int[][] num = new int[n][m];

        System.out.println("Enter numbers: ");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("The spiral order matrix is: ");

        int row_start = 0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = m-1;
        

        while(row_start <= row_end && col_start <= col_end ){

            for(int col=col_start;col<=col_end;col++){
                System.out.print(num[row_start][col]+" ");
                
            }
            row_start++;

            for(int row=row_start;row<=row_end;row++){
                System.out.print(num[row][col_end]+" ");  
            }
            col_end--;

           
            for(int col=col_end;col>=col_start;col--){
                System.out.print(num[row_end][col]+" ");
                    
            }
                row_end--;
            

           
            for(int row=row_end;row>=row_start;row--){
                System.out.print(num[row][col_start]+" ");
                    
            }
            col_start++;

                
            System.out.println();
        }

    }
}
