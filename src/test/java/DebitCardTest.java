import Payment.DebitCard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    private DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(12345, 0227, 123, 12345, 0233);
    }

    @Test
    public void canBeCharged(){
        assertEquals("You've been charged £2.0", debitCard.getCharged(2.0));
    }


}

