public class Drink {


    private double price;

    public void setPrice(double price){
        if (price < 0){
            throw new IllegalArgumentException("Price can not be negativ" + price);
        }
        this.price = price;
    }


}
