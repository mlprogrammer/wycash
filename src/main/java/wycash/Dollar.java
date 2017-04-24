package wycash;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplayer){
        return new Dollar(amount * multiplayer, currency);
    }
}
