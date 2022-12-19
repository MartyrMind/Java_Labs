package practs.pract_27;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class task_2 {
    private Map<String, String> map;
    public Map<String, String> make_map (){
        map = new HashMap<>();
        map.put("Абрамов", "Леонид");
        map.put("Майоров", "Дмитрий");
        map.put("Киселев", "Леонид");
        map.put("Власова", "Майя");
        map.put("Кузнецов", "Марсель");
        map.put("Иванова", "Варвара");
        map.put("Кузнецова", "Михаил");
        map.put("Васильев", "Константин");
        map.put("Соколова", "Амелия");
        map.put("Иванова", "Полина");
        return map;
    }
    public Map<String, Integer> getSameFirstNameCount () {
        Map<String, Integer> result = new TreeMap<String, Integer>();
        for (Map.Entry<String, String> entry:map.entrySet()) {
            String value = entry.getValue();
            Integer count = result.get(value);
            if (count == null)
                result.put(value, new Integer(1));
            else
                result.put(value, new Integer(count+1));
        }
        return result;
    }

    public Map<String, Integer> getSameLastNameCount () {
        Map<String, Integer> result = new TreeMap<String, Integer>();
        for (Map.Entry<String, String> entry:map.entrySet()) {
            String value = entry.getKey();
            Integer count = result.get(value);
            if (count == null)
                result.put(value, new Integer(1));
            else
                result.put(value, new Integer(count+1));
        }
        return result;
    }

    public static void main(String[] args) {
        task_2 task = new task_2();
        Map<String, String> map = task.make_map();
        System.out.println(map);
        Map<String, Integer> result = task.getSameFirstNameCount();
        System.out.println(result);
        result = task.getSameLastNameCount();
        System.out.println(result);
    }
}
