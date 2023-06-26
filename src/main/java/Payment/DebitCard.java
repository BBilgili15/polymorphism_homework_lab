package Payment;

public class DebitCard extends BankCard implements IChargeable {
    private int accountNumber;
    private int sortCode;

    public DebitCard(int cardNumber, int expiryDate, int securityNumber, int accountNumber, int sortCode){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public String getCharged(double price){
        return "You've been charged £" + price;
    }


}
