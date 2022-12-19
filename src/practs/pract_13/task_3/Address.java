package practs.pract_13.task_3;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Address {
    private ArrayList<String> address = new ArrayList<>();

    public void splitData(String data) {
        address.clear();
        StringTokenizer tokenizer = new StringTokenizer(data, ",.;");
        while (tokenizer.hasMoreTokens()) {
            address.add(tokenizer.nextToken());
        }
    }

    @Override
    public String toString() {
        StringBuilder answ = new StringBuilder();
        for (String s : address) {
            answ.append(s).append(" ");
        }
        return answ.toString();
    }
}
