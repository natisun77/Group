package homework.seventh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ScalableMapExample {
    Map<String, Integer> map;

    public ScalableMapExample() {
        System.out.println("ConcurrentHashMap");
    }

    private void addValue() {
        System.out.println("  in the begining: " + map);
        Iterator<String> t = map.keySet().iterator();
        System.out.print("  cycle: ");
        while (t.hasNext()) {
            String key = t.next();
            if (key.equals("2")) {
                map.put(key + "new", 25);
            } else
                System.out.print("  " + key + "=" + map.get(key));
        }
        System.out.println();
        System.out.println("  at the end: " + map);
    }

    private void createMap() {
        map = new ConcurrentHashMap<String, Integer>();
        map.put("1", 1);
        map.put("2", 1);
        map.put("3", 1);
        map.put("4", 1);
        map.put("5", 1);
        map.put("6", 1);
    }

    public static void main(String[] args) {
        ScalableMapExample mapExample = new ScalableMapExample();
        mapExample.createMap();
        mapExample.addValue();

    }
}
