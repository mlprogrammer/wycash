package wycash;

public class Money implements Expression {
    
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    
    public Money times(int multiplayer) {
        return new Money(amount * multiplayer, currency);
    }
    
    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }
    
    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return money.amount == amount && currency.equals(money.currency);
    }
    
    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Money addend) {
        return new Money(addend.amount + this.amount, currency);
    }

    public Money reduce(String to) {
        return this;
    }
    
}
