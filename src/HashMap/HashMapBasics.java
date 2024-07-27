package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapBasics {

static void HashMap() {

    Map<String, Integer> map = new HashMap<>();
    map.put("Akash", 23);
    map.put("Yash", 16);
    map.put("luv", 17);
    map.put("Rishikesh", 19);
    map.put("Harry", 18);
    for (String key : map.keySet()) {
        System.out.println(map.get(key));

    }
}




    public static void main(String[] args) {
   HashMap();
    }
}
