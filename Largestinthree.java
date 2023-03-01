import java.util.*;
class Largestinthree {
    public static void main(String k[])
    {
        int a,b,c;
        System.out.println("enter three number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();


        if(a>b)
            {
                if(a>c)
                System.out.println(a+"is largest");
                else
                System.out.println(c+"is largest");
            }else{
                if(b>c)
                System.out.println(b+"is largest");
                else
                {
                    System.out.println(c+"is largest");
                }
            }

    }    
}
