import java.util.*;
//LinkeList:the linkedlsit class in java is part of the Collection Framework and implements the List Interface. Unlike a ArrayList, which uses a dynamic array to store the elements, a LinkedList stores it elements as nodes in doubly linkedlist. 
// A linkedlist  is a linear data structure where each element is a seperate object called a node. each node contains two parts: Data: the value stored in a node, Pointers: two pointers, one pointing to the next node(Next) and the other pointing to the previous node(Previous)
public class LinkedListExample {
    public static void main(String k[])
    {
        
    LinkedList<Integer> list=new LinkedList<>();
    list.add(1);
    list.add(2);
    list.add(3);

    System.out.println(list);
    System.out.println(list.get(2));//O(N)

    list.addFirst(4);//O(1)
    list.addLast(5);//O(1)
    System.out.println(list);

    System.out.println(list.getFirst());
    System.out.println(list.getLast());
    
    list.remove();// remove first node
    System.out.println(list);
    list.remove(3);
    System.out.println(list);

    list.removeIf(x->x%2==0);
    System.out.println(list);
    

    LinkedList<String> animals=new LinkedList<>(Arrays.asList("cat","dog","elephant"));
    System.out.println(animals);
    LinkedList<String> annimalstoremove=new LinkedList<>(Arrays.asList("cat","lion"));
    animals.removeAll(annimalstoremove);
    System.out.println(animals);
    }


}
