import java.util.*;

public class twoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int cols = sc.nextInt();
        System.out.println("Enter numbers: ");
        int[][] numbers = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
         
       // System.out.println("Enter number X whose index you want to search");
        //int x = sc.nextInt();
        //for(int i=0;i<rows;i++){
           // for(int j=0;j<cols;j++){
               // if(numbers[i][j] == x){
               //     System.out.println("index number of x is: "+i+","+j);
               // }
           // }
           // System.out.println();
        //}
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }


    }
}
