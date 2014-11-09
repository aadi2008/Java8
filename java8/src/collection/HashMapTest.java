package collection;
import java.util.HashMap;
import java.util.Map;
 
public class HashMapTest {
 
 
    public static void main(String[] args) {
 
        HashMap<Integer, String> map = new HashMap();
         
        map.put(5, "Five");
        map.put(8, "Eight");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");
         
        String text = map.get(6);
         
        System.out.println(text);
         
        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
             
            System.out.println(key + ": " + value);
        }
        
        for(Integer key : map.keySet()){
        	String value  = map.get(key);
        	
        	System.out.println("Key " + key + "  value " + value);
        	
        }
         
    }
 
}