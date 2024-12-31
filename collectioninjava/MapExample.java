import java.util.*;
/*
 Map: a Map is an object that maps keys to values. it cannot contain duplicate keys and each key can map to at most one value. 
 - Map does not extend the collection interface.
 -key-value pairs
 -one value per key
 -unique keys
  */
//implementation of Map 
/*
 HashMap: 
 */
public class MapExample {

    public static void main(String []k)
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"ashu");
        map.put(2,"hema");
        map.put(3,"ankit");

        System.out.println(map);

        System.out.println(map.get(3));

        System.out.println(map.get(10));

        System.out.println(map.containsKey(5));
        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("ashu"));

        //loop over map
        Set<Integer> s=map.keySet();
        for(int i:s){
            System.out.println(map.get(i));
        }

        //using entry set
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String> i:entries)
        {
            System.out.println(i.getKey()+":"+ i.getValue());
        }
        for(Map.Entry<Integer,String> i:entries)
        {
           i.setValue(i.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(3);
        System.out.println(map);
    }

}
