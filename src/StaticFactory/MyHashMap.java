package StaticFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyHashMap {

    public static <key, value> HashMap<key, value> createInstance() {
        return new HashMap<>();
    }

    public static void main(String[] args) {

        //  Create a map that stores a letter as ID-key-value and
        //  a list with int-values in it.
        Map<String, List> map = MyHashMap.createInstance();

        //  Create two different types of a list
        //  First, a list that contains int-numbers.
        List<Integer> intList = new ArrayList<>();
        intList.add(11);
        intList.add(22);
        //  Second, a list that contains Strings.
        List<String> stringList = new ArrayList<>();
        stringList.add(Integer.toString(333));
        stringList.add(Integer.toString(666));

        //  Bind the ID-key-value and the lists each other in the hashmap.
        map.put("a", intList);
        map.put("b", stringList);

        //  Request the hashmap for it's entries.
        System.out.println(map.get("a"));
        System.out.println(map.get("b"));
        System.out.println(map.get("c"));
        
    }
    
}