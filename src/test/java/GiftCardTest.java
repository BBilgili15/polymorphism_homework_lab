import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    private GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(100.00);
    }

    @Test
    public void canBeCharged(){
        giftCard.getCharged(50.00);
        assertEquals(50.00, giftCard.getBalance(),0.0);
    }
}
