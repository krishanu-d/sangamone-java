import java.util.*;
public class Forloop{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input  number to find its multiplication table");
        int a =sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(i*a);
        }
        

        
    }
}