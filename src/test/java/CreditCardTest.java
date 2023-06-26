import Payment.CreditCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    private CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(12345, 0227, 123, 1000.00);
    }



    @Test
    public void canBeCharged(){
        assertEquals("You've been charged £2.02", creditCard.getCharged(2.0));
    }
}
