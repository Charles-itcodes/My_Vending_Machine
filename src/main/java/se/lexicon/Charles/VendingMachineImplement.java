package se.lexicon.Charles;

import java.util.HashMap;
import java.util.Map;

public class VendingMachineImplement implements VendingMachine{

    private static Map<Integer, Product> listOfPruducts = new HashMap<Integer, Product>();
    private int  poolAmout=0;

    public VendingMachineImplement() {

        listOfPruducts.put(new Drinks().getProductNumber(),new Drinks());
        listOfPruducts.put(new Food().getProductNumber(), new Food());
    }

    @Override
    public void addCurrency(int amount) { poolAmout=poolAmout+amount;

    }

    @Override
    public Product request(int productNumber) {
        return listOfPruducts.get(productNumber);
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public int getBalance() {
        return poolAmout;
    }

    @Override
    public String getDescription(int description) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}



