import java.util.*;

public class arrayques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int N = sc.nextInt();

        System.out.println("Enter elements in array: ");
        int[] A = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        System.out.println("Enter value of X: ");
        int X = sc.nextInt();

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(X == A[i]+A[j]){
                    System.out.println("Yes");
                }
            }
        }
        
    }
}
