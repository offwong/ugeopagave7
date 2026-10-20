import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<String> readLines(String path)
        throws FileNotFoundException{
        ArrayList<String> lines = new ArrayList<>();

        try (Scanner scan = new Scanner(new File(path))){
            while (scan.hasNextLine()){
                String line = scan.nextLine();
                lines.add(line);
            }
        }
        return lines;
    }

    public static void main(String[] args) {
        Drink drink = new Drink();
        try {

            drink.setPrice(-5.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Unknown price: " + e.getMessage());

        }
        ArrayList<String> items = new ArrayList<>();
        items.add("Coffe");
        items.add("Expresso");

        try {
            System.out.println(Opgave_1.getItem(items, 1));

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            ArrayList<String> lines = readLines("tekst.txt");

            for (String line : lines) {
                System.out.println(line);
            }
            ArrayList<String> missingLines = readLines("file-doesnt-exist.txt");
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
        }

    }


}
