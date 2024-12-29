/*List: ordered sequence, allow duplicate, implemented by ArrayList, LinkedList, vector,Stack., index-based access
*/

/*
 Arraylist: an arraylist is a resizable array implementation of the List interface.unlike arrays in java, which have a fixed size. an ArrayList can change it size dynamically as elements are added or removed. the dynamic resizing is achieved by creating a new array when the current array is full and copying the element to the new array. initial capacity is 10.>
 */

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;
import java.util.*;

class mycomparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1,Integer o2)// if return negative number then o1 come first and o2 come next, if return 0 then both are same, and if return positive number 02 comes first . take example of 5,3 and sort it in asc order.
    {
        return o2-o1;
        }
}

class StringlengthComparator implements Comparator<String>{
    @Override
    public int compare(String s1,String s2)
    {
        return s1.length() - s2.length();
    }
}


public class ListExample {
   public static void main(String k[])
   {
     //declaration
    List<Integer> arr1=new ArrayList<>();
    ArrayList<Integer> arr2=new ArrayList<>();
    arr2.add(3);
    arr2.add(4);
    arr2.add(5);
    System.out.println(arr2.get(0));
    System.out.println(arr2.size());

    for(int i=0;i<arr2.size();i++)
    {
        System.out.println(arr2.get(i));
    }
    for(int x:arr2)
    {
        System.out.println(x);
    }

    System.out.println(arr2.contains(3));
    System.out.println(arr2.contains(30));

    //remove element
    arr2.remove(2);

    // add element at particular index and shift the list
    arr2.add(0,20);
    System.out.println(arr2);


    //replace the element of that index
    arr2.set(1,22);
    System.out.println(arr2);

    //converting list to array
    Integer[] array= arr2.toArray(new Integer[0]);
    System.out.println(array.getClass().getSimpleName()); 

    // sorting arraylist
    Collections.sort(arr2);
    System.out.println(arr2);
    
    ArrayList<Integer> arr=new ArrayList<>();
    arr.add(8);
    arr.add(1);
    arr.add(11);
    arr.add(0);
    arr.sort(null); //here parameter is comparator to modify the working of sort method.
    System.out.println(arr);

    //Comparator:comparator is a interface which help us to modify sort.

    //sort list in descending method
    arr.sort(new mycomparator());
    System.out.println(arr);


    // sort string 
    List<String> words=Arrays.asList("banana","apple","date");
    words.sort(null);
    System.out.println(words);

    // sort string wrt to length of string
    words.sort(new StringlengthComparator() );
    System.out.println(words);
    // now using lamda function
    arr2.sort((a,b)-> b-a );
    System.out.println(arr2);

    words.sort((a,b)->b.length()-a.length());
    System.out.println(words);







    
   }

   
   
    
} 
