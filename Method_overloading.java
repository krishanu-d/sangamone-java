import java.util.*;
 
class method{
    public void display(int a){
        System.out.println("Input " + a);
    }
    public void display(int a, int b){
        System.out.println("Input " +a+" and "+b);
    }
    public void display(String a){
        System.out.println("Input String: " + a);
    }

}


public class Method_overloading{
    public static void main(String args[]){
        method obj = new method();
        obj.display(2);
        obj.display(2,5);
        obj.display("Krishanu");

    }
 }
