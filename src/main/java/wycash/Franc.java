package wycash;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiplayer) {
        return new Money(amount * multiplayer, currency);
    }

}
