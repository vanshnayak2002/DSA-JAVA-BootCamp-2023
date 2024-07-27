
package PRACTISE2024;
import java.util.*;
public class stringBudget {


    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        //k v
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        System.out.println(map);
        System.out.println(map.get("one"));

        if (map.containsKey("two")) {
            System.out.println("yes");
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());

        }
        map.remove("Two");
        System.out.println("After removing key 'Two': " + map);

    }
    }

