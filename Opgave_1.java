import java.util.ArrayList;
import java.util.Scanner;

public class Opgave_1 {


    Scanner scan = new Scanner(System.in);

    public int promptNumber (String msg) {
        System.out.println(msg);
        try {
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Write a whole number");
            return promptNumber(msg);
        }
    }

    private ArrayList<String> items;

    public static String getItem(ArrayList<String> items, int index) {
        if (index < 0 || index >= items.size()){
            throw new IllegalArgumentException(
                    "Index " + index + " is out of range 0-" +(items.size() - 1));

        } return items.get(index);
    }




}
