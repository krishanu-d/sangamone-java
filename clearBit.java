import java.util.*;
public class clearBit{
    public static void main(String args[]) {
        int n=5; //0101
        int pos=2;
        int bitMask=1<<pos;

       int newbitmask = ~(bitMask);
       int newnumber =newbitmask & n;
       System.out.println(newnumber);
    }
}