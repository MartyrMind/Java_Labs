package practs.pract_18;

public class task_5 {
    public void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
//        if (key == null) {
//            throw new NullPointerException("null key in getDetails");
//        }
    }

    public static void main(String[] args) {
        task_5 test = new task_5();
            test.getDetails(null);
    }
}
