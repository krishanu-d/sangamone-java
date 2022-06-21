import java.util.*;
public class updateBit{
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int oper = sc.nextInt();
        int n=5; //0101
        int pos=1;
        int bitMask=1<<pos;
        if(oper==1){
            int newnumber = bitMask | n;
            System.out.println(newnumber);
        }else{
            int newbitmask= ~(bitMask);
            int newnumber = newbitmask & n;
            System.out.println(newnumber);

        }

        
    }
}