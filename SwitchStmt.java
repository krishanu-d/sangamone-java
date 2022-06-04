import java.util.*;
public class SwitchStmt{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 3");
        int a =sc.nextInt();
        switch(a){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid Input, Only between 1 to 3");
        }
        

        
    }
}