package HashMap;

import java.util.HashMap;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India",123);
        hm.put("China",223);
        hm.put("Pak",564);
        hm.put("US",22);
        hm.put("UK",20);

        System.out.println(hm);
        hm.put("Nigeria",5);
        hm.put("US",11);

        System.out.println(hm);
        System.out.println(hm.get("India"));
        System.out.println(hm.get("usa"));

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("usa"));

        Set <String> keys=hm.keySet();
        System.out.println(keys);
        for (String key: hm.keySet()) {
            Integer val= hm.get(key);
            System.out.println(key+" "+  val);
        }
 
    }

}
