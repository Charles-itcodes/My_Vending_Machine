package se.lexicon.Charles;

public class Fruits implements Product{
    private int productNumber=2;
    private String name = "Mango";
    private int price = 2;
    private int calories =20;


    
    @Override
    public int getProductNumber() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String examine() {
        return null;
    }

    @Override
    public String use() {
        return null;
    }
}
