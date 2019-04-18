package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap {
    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        map.put("s" ,"a");
        map.put("b","c");
        map.put("o","c");

        for(Map.Entry<String,String> entry :  map.entrySet()) {
            System.out.println("Key" + entry.getKey());
            System.out.println("Value" + entry.getValue());

        }
        Map<String,String> tree = new TreeMap<>(map);

        for(Map.Entry<String,String> entry :  tree.entrySet()) {
            System.out.println("Key" + entry.getKey());
            System.out.println("Value" + entry.getValue());

        }


    }


}
