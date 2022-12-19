package practs.pract_27;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class convetation {
    public static void main(String[] args) {
        Set<Integer> setobj = new HashSet<>();
        setobj.add(1);
        setobj.add(3);
        setobj.add(7);
        setobj.add(2);
        setobj.add(4);

        System.out.println("HashSet: "
                + setobj);

        // Convert the HashSet to TreeSet
        Set<Integer> hashSetToTreeSet
                = new TreeSet<>(setobj);

        // Print the TreeSet
        System.out.println("TreeSet: "
                + hashSetToTreeSet);
    }
}
