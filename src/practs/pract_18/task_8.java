package practs.pract_18;

import java.util.Scanner;

public class task_8 {
    public void getKey()  {
        Scanner myScanner = new Scanner( System.in);
        boolean success = false;
        while (!success) {
            System.out.print( "Enter Key ");
            String key = myScanner.next();
            try {
                printDetails("");
                success = true;
            } catch (Exception e) {
                System.out.println("Invalid key");
            }
        }
    }
    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println( message );
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key == "") {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }
    public static void main(String[] args) {
        task_8 test = new task_8();
        try {
            test.getKey();
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
