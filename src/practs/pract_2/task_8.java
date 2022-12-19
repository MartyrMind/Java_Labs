package practs.pract_2;

import java.util.*;

public class task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Количество слов: ");
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) list.add(in.next());
        Collections.reverse(list);
        list.forEach(System.out::println);

    }
}
