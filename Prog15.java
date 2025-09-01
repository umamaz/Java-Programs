import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class Prog15 {
    public static void main( String[] args) {
       
        // 1. ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList elements:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println();

        
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); 

        System.out.println("HashSet elements:");
        for (int num : set) {
            System.out.println(num);
        }
        System.out.println();

        // 3. HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Blue");

        System.out.println("HashMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    
    }
    

