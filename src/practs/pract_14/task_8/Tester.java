package practs.pract_14.task_8;

import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
    public static ArrayList<Object> filter(ArrayList<Object>objects, Filter filter) {
        ArrayList<Object> result = new ArrayList<>();
        for (Object o : objects) {
            if (filter.apply(o)) {
                result.add(o);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        //тестовые данные
        ArrayList<Object> test1 = new ArrayList<>(Arrays.asList("hey", "hello", "hi", null, "goodbye"));
        ArrayList<Object> test2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        //тесты
        System.out.println(filter(test1, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        }));

        System.out.println(filter(test2, new Filter() {
            @Override
            public boolean apply(Object o) {
                return (int) o % 2 == 0;
            }
        }));


    }
}
