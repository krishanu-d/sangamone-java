

import java.util.*;
class ball{
    public void size(){
        System.out.println("Depends on whcih type of ball");
    }

}
class football extends ball{
    public void size(){
        System.out.println("Diameter of 22cm");
    }
}
class volleyball extends ball{
    public void size(){
        System.out.println("Circumfrence of 26 inches");
    }
}

public class Method_overridding {
    public static void main(String args[]){
       ball a=new ball();
       football b = new football();
       volleyball c= new volleyball();
       a.size();
       b.size();
       c.size();


    }
}
