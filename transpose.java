import java.util.*;

public class transpose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row = s.nextInt();
        System.out.println("Enter number of columns:");
        int col = s.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enetr numbers in matrix");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = s.nextInt();
            }
        }

        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
       }

    }
}
