package HAshMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        //Creation
        HashMap<String, Integer> map = new HashMap<>();
        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);
        //Searching
        if(map.containsKey("Indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }

        System.out.println(map.get("China")); //key exists
        System.out.println(map.get("Indonesia")); //key doesn't exist

        //Iteration (1)
        for( Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        //Iteration (2)
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key+ " " + map.get(key));
        }
        //Removing
        map.remove("China");
        System.out.println(map);

    }



//        HashMap<String,Integer> hm=new HashMap<>();
//        hm.put("India",123);
//        hm.put("China",223);
//        hm.put("Pak",564);
//        hm.put("US",22);
//        hm.put("UK",20);
//
//        System.out.println(hm);
//        hm.put("Nigeria",5);
//        hm.put("US",11);
//
//        System.out.println(hm);
//        System.out.println(hm.get("India"));
//        System.out.println(hm.get("usa"));
//
//        System.out.println(hm.containsKey("India"));
//        System.out.println(hm.containsKey("usa"));
//
//        Set<String> keys=hm.keySet();
//        System.out.println(keys);
//        for (String key: hm.keySet()) {
//            Integer val= hm.get(key);
//            System.out.println(key+" "+  val);



}
