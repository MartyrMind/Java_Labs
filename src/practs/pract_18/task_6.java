package practs.pract_18;

public class task_6 {

    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }
    public String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            return "NullPointerException";
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        task_6 test = new task_6();
        test.printMessage("4");
    }
}
