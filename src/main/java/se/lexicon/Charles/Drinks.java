package se.lexicon.Charles;

public class Drinks implements Product {

    private String name = "Coca-Cola";
    private double price = 20.10;
    private int calories = 100;
    private int productNumber=0;


    public void setName(String name) {
        this.name = name;
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


    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
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


}
