package se.lexicon.Charles;

public class Food implements Product{

    private int productNumber=1;
    private String name = "Blue Cheese";
    private double price = 15.10;
    private int calories = 25;


    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String examine() {
        return name;
    }

    @Override
    public String use() {
        return null;
    }

    @Override
    public int getProductNumber() {
        return productNumber;
    }

    @Override
    public String getName() {
        return name;
    }

}

