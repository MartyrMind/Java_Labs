package practs.pract_7.task_3;

public class ProcessString implements StringProcessor{
    @Override
    public int cntLiter(String str) {
        return str.length();
    }

    @Override
    public String substring(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }

    @Override
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
