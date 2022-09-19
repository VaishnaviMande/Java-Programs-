import java.util.*;

public class Tokenization {
    public static void main(String[] args) {
        
        String[]  charline = {"c","=","a","+","b",";"};
        System.out.println("Enter your String of character: ");
        System.out.println(charline.length);
        
        
        for(int i=0;i<charline.length;i++){
            if(charline[i] == "a" || charline[i]=="b" || charline[i]=="c" || charline[i]=="d"){
                System.out.println(charline[i]+" :is a identifier");
            }
            else if(charline[i] =="*" || charline[i]=="=" ||charline[i]=="+" || charline[i]=="-" || charline[i]=="%" || charline[i]=="/"){
                System.out.println(charline[i]+" :is a operator");
            }
            else if(charline[i]==";" || charline[i]=="." || charline[i]==","){
                System.out.println(charline[i]+" :is a seperator");
            }
        }
        
        
    }
}
