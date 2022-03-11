package collections;

import java.util.HashMap;
import java.util.Map;

public class ExampleHashMap {

        public static void main(String[] args) {
        // Hashmap
        HashMap<String,int[]> cities = new HashMap<String,int[]>();
        String saopaulo = "sao paulo";
        int[] tmp = {29, 34};
        cities.put(saopaulo,tmp);

        for(HashMap.Entry<String, int[]> pair : cities.entrySet()) {
            int[] lista = pair.getValue();
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        HashMap<String,int[]> map = new HashMap<String,int[]>();

        for(Map.Entry<String, int[]> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
