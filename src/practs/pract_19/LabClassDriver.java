package practs.pract_19;

import java.util.ArrayList;

public class LabClassDriver {
    public static void main(String[] args) {
        ArrayList<Comparable> s = new ArrayList<>();
        s.add(new Student("Efremova Aleksandra", 5.0));
        s.add(new Student(" Volkov Mikhail", 4.4));
        s.add(new Student("Kharitonov Oleg", 4.5));
        s.add(new Student("Selivanova Sofiia", 4.8));
        s.add(new Student("Lazarev Iurii", 3.9));
        new LabClassUI(s);
    }
}
