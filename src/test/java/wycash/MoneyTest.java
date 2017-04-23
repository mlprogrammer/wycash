package wycash;

import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {

    @Test
    public void testDolarEquality(){
        Dollar five = new Dollar(5);
        Assert.assertEquals(new Dollar(10), five.times(2));
        Assert.assertEquals(new Dollar(15), five.times(3));
        Assert.assertNotEquals(new Dollar(6), five.times(2));
        Assert.assertNotEquals(new Dollar(10), new Franc(10));
    }
    
    @Test
    public void testFrancEquality(){
        Franc five = new Franc(5);
        Assert.assertEquals(new Franc(10), five.times(2));
        Assert.assertEquals(new Franc(15), five.times(3));
        Assert.assertNotEquals(new Franc(6), five.times(2));
    }
    
    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);
        Assert.assertEquals(new Dollar(5), five);
    }
    
}
