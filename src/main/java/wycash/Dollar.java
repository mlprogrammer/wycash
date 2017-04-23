package wycash;

public class Dollar extends Money{

    public Dollar(int amount) {
        super(amount);
    }

    public Dollar times(int multiplayer) {
        return new Dollar(amount * multiplayer);
    }
    
}
