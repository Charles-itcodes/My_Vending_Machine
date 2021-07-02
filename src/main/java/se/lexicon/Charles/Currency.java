package se.lexicon.Charles;

public enum Currency {

    ONE_SEK(1), TWO_SEK(2), FIVE_SEK(5),TEN_SEK(10),TWENTY_SEK(20), FIFTY_SEK(50), HUNDRED_SEK(100),FIVE_HUNDRED_SEK(500),THOUSAND_SEK(100);

    private int value;

    Currency(int value){
        this.value = value;
    }

    public int getValue(){

        return this.value;
    }
}

