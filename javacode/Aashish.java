import java.lang.*;
import java.io.*;
class Hi extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
               System.out.println("hi");
              
          
        }
    }
}

class Hello extends Thread
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
              System.out.println("hello");
             
        }
    }
}

class Ithread
{
    public static void main(String []k)
    {
        Hi obj1=new Hi();
        Hello obj2=new Hello();
        
        obj1.start();
        obj2.start();
        
        
    }
}


