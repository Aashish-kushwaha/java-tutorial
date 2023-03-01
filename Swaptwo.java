import java.util.*;
class Swaptwo {
    public static void main(String s[])
    {
        int x,y;
        System.out.println("enter two number:");
        Scanner ss=new Scanner(System.in);

        x=ss.nextInt();
        y=ss.nextInt();

        System.out.println("number before swapping a:"+x+" b:"+y);

        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("number after swapping a:"+x+" b:"+y);

        
    }
    
}
