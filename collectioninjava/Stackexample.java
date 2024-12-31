import java.util.Stack;
// Stack class in java is used to implement a stack data structure . the class is based on LIFO principle, it extends vector class and provides additional functionality 
public class Stackexample {
    public static void main(String k[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);


        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(1));


        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }

       

    }
}
