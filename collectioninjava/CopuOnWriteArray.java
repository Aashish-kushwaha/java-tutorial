import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
/*
 CopyOnWriteArrayList: It implements list interface, all the modification on this arraylist is implemented by making a fresh copy, used in concurrent environment.
 it creates a cloned copy of underlying arraylist for every update operation at a certain point both will be synchronized automatically, which is taken care of by JVM. so there is no effect for threads that are performing read operation.
*  also it is a costly operation, used when most frequent operation is read

* it is a thread safe version of Arraylist
* 


 */

public class CopuOnWriteArray {
    public static void main(String []k)
    {
        CopyOnWriteArrayList<String> ls=new CopyOnWriteArrayList<>();
        ls.add("milk");
        ls.add("cake");
        ls.add("butter");
        ls.add("coke");

        for(String s:ls)
        {
            System.out.println(s);;
            if(s.equals("cake"))
            {
                ls.add("biscuit");
                System.out.println("adding while reading");
            }
        }

        System.out.println(ls);
    }
    
}
