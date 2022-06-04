import java.util.*;

public class rotatedHalfPyramid{
    public static void main(String args[]){
        
        int n=5,m=5;
        for(int i=1;i<=5;i++){
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        
    }
}