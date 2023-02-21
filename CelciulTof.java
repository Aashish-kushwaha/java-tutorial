import java.util.*;
 class CelciulTof {

    public static void main(String []k)
    {
        float temp;
        Scanner in=new Scanner(System.in);
        System.out.println("enetr the value in fahrenheit");
        temp=in.nextFloat();

        temp=((temp-32)*5)/9;

        System.out.println("temperature inn celsius="+temp);
    }
    
}
