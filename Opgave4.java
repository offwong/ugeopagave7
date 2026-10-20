import java.util.ArrayList;

public class Opgave4 {

    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>();
        data.add("Espresso, a concentrated coffee, 25.0");
        data.add("Latte, basically Espresso with milk, 45.0");
        data.add("Cola, cold and sweet, 30.0");
        data.add("Water, Ice water, Hot water");

        double total = 0;

        for (String item : data) {
            String[] parts = item.split(",");

            String name = parts[0].trim();
            String description = parts[1].trim();

            try {
                double price = Double.parseDouble(parts[2].trim());


                System.out.println(name + " - " + description + " (" + price + " kr)");

                total += price;
            } catch (NumberFormatException e){
                System.out.println("Unknown price " + name + ": " + parts[2].trim());
            }
        }
        System.out.println("Total price " + total + " kr.");


    }
}
