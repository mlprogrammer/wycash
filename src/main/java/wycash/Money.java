package wycash;

public class Money {
    
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    Money times(int multiplayer) {
        return null;
    }

    public String currency() {
        return currency;
    }
    
    public static Money dollar(int amount, String currency) {
        return new Dollar(amount, currency);
    }
    
    public static Money franc(int amount, String currency) {
        return new Franc(amount, currency);
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return money.amount == amount && getClass().equals(obj.getClass());
    }
    
    @Override
    public String toString() {
        return amount + " " + currency;
    }
    
}
