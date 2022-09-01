import java.util.*;

public class arrayques {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter numbers");

        for(int i=0;i<(size);i++){
            numbers[i]=sc.nextInt();
        }

        System.out.println("Enter x value whose index number you want to search: ");
        int x = sc.nextInt();

        for(int i=0;i<(size);i++){
            if(x == numbers[i]){
                System.out.println("Index of x is : "+ i);
            }
        }
    }
}
