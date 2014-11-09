package collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
 
public class MapTest {
 
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>(); //not in sorted order
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();// in order you added element , it will return in same order   
        Map<Integer, String> treeMap = new TreeMap<Integer, String>(); //sorted order
         
        System.out.println("HashMap........"); 
        testMap(hashMap);
        System.out.println("LinkedHashMap........");            
        testMap(linkedHashMap);
        System.out.println("TreeMap........");
        testMap(treeMap);
    }
     
    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");
         
        for(Integer key: map.keySet()) {
            String value = map.get(key);
             
            System.out.println(key + ": " + value);
        }
    }
     
}