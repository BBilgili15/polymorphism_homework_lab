import Payment.CreditCard;
import Payment.IChargeable;
import Payment.Wallet;
import org.junit.Before;
import Payment.DebitCard;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    private Wallet wallet;

    private GiftCard giftCard;
    private DebitCard debitCard;
    private CreditCard creditCard;
    private GiftCard giftCard1;

    @Before
    public void before(){
        ArrayList<IChargeable> iChargeables = new ArrayList<>();
        giftCard = new GiftCard(100.00);
        giftCard1 = new GiftCard(100.00);
        iChargeables.add(giftCard);
        creditCard = new CreditCard(12345, 0227, 123, 1000.00);
        iChargeables.add(creditCard);
        debitCard = new DebitCard(12345, 0227, 123, 12345, 0233);
        iChargeables.add(debitCard);
        wallet = new Wallet(iChargeables, debitCard);

    }
    @Test
    public void canChangeSelectedIChargeable(){
        wallet.setSelectedIChargeable(creditCard);
        assertEquals(creditCard, wallet.getSelectedIChargeable());
    }

    @Test
    public void canPayWithSelectedIChargeable(){
        IChargeable selectedPayment = wallet.getSelectedIChargeable();
        assertEquals("You've been charged £3.0", selectedPayment.getCharged(3.00));
    }

    @Test
    public void canAddNewIChargeable(){
        wallet.addNewIChargeable(giftCard1);
        assertEquals(4, wallet.getiChargeables().size());
    }
}
