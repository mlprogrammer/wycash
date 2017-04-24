package wycash;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class MoneyTest {

    @Test
    public void testEquality(){
        assertEquals(Money.dollar(5, "USD"), Money.dollar(5, "USD"));
        assertNotEquals(Money.dollar(6, "USD"), Money.dollar(5, "USD"));
        assertEquals(Money.franc(5, "CHF"), Money.franc(5, "CHF"));
        assertNotEquals(Money.franc(6, "CHF"), Money.franc(5, "CHF"));
    }
    
    @Test
    public void testFrancMultiplication(){
        Money five = Money.franc(5, "CHF");
        assertEquals(Money.franc(10, "CHF"), five.times(2));
        assertEquals(Money.franc(15, "CHF"), five.times(3));
    }
    
    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1, "USD").currency());
        assertEquals("CHF", Money.franc(1, "CHF").currency());
    }
    
}
