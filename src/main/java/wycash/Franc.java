package wycash;

public class Franc extends Money{

    public Franc(int amount) {
        super(amount);
    }

    public Franc times(int multiplayer) {
        return new Franc(amount * multiplayer);
    }
}
