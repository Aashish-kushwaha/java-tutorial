import java.util.*;
// A vector is a part of the java.util package and is one of the legacy classes in java that implements the list interface.
// it was introduced in JDK1.0 before collection framework and is synchronized, making it thread-safe.
// due to its synchronization overhead,it's generally recommended to use other modern alternatives like arrayList in single-threaded scenarios.
public class VectorExample {
   public static void main(String []k)
   {
     Vector<Integer> vec=new Vector<>();
    vec.add(1);
    vec.add(1);
    vec.add(1);
    vec.add(1);
    vec.add(1);
    System.out.println(vec);
    System.out.println(vec.capacity());

    for(int i=0;i<vec.size();i++)
    {
        System.out.println(vec.get(i));
    }
    vec.add(1,12);
    System.out.println(vec);
    ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,3));
    vec.addAll(arr);
    vec.set(4,23);
    System.out.println(vec);

    System.out.println(vec.contains(2));
    System.out.println(vec.containsAll(arr));

    System.out.println(vec.isEmpty());
    vec.remove(2);
    vec.remove( new Integer(23));
    System.out.println(vec);
    vec.sort(null);
    System.out.println(vec);

   }
    
}
