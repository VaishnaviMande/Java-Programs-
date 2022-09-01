import java.util.*;

public class arrayques1 {
    public static void main(String[] args) {
      
      /*   Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        System.out.println("Enter name");
        String[] names = new String[size];

        */
        Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      String names[] = new String[size];
 

        for(int i=0;i<size;i++){
            names[i] = sc.next();
            
        }

        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }
 
        
    }
}
