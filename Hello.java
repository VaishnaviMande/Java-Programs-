import java.util.*;
public class Hello{

public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            
            System.out.println("Sum is :" + sum);
        }
    }
}