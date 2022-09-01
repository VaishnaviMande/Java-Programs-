import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater");
        }else if(a == b){
            System.out.println(" a and b are equal");
        }
        else{
            System.out.println("b is greater");
        }
    }
}
