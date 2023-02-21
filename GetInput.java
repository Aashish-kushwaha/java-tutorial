import java.util.Scanner;

import java.util.*;

class GetInput {
    public static void main(String []k)
    {
        int a;
        float b;
        String s;

        Scanner in=new Scanner(System.in);

        // enter string

        System.out.println("enter a String");
        s=in.nextLine();
        System.out.println("you entered "+s);

        // enter integer value

        System.out.println("enter the integer value");
        a=in.nextInt();
        System.out.println("your value"+a);

        // enter flaot
        System.out.println("enter the value of flaot");
        b=in.nextFloat();
        System.out.println("flaot"+b);
        
        
    }
}
