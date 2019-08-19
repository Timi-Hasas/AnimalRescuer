package fasttrackit;


import java.util.Date;

public class Food {
    String foodName;
    float foodPrice;
    int foodQuantity;
    boolean availability;
    Date expirationDate;


    public Food(String name, float price, int quantity, boolean stock)
    {
        foodName = name;
        foodPrice = price;
        foodQuantity = quantity;
        availability = stock;

    }
}
