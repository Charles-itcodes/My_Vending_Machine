package se.lexicon.Charles;

public interface VendingMachine {

    void addCurrency(int amount);

    Product request(int productNumber);

    int endSession();

    int getBalance();

    String getDescription(int description);

    String[] getProducts();
}

