import java.util.*;

public class ques1 {
public static void printAverage(int a, int b, int c){
    
    float average = (a + b + c)/3;
    System.out.println(" the average is : " + average);
    return;
}

public static void main(String[] args) {
    System.out.println("Enter 3 numbers: ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    printAverage(a, b, c);
}

}
    

