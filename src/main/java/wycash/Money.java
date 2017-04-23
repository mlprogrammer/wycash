package wycash;

public class Money {
    
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }
    
    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return money.amount == amount && getClass().equals(obj.getClass());
    }

    public static Money dollar(int i) {
        return null;
    }
    
}
