import Payment.IChargeable;

public class GiftCard implements IChargeable {
    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public String getCharged(double price){
        if (this.balance > price) {
            this.balance -= price;
            return "Payment successful";
        } else {
            return "Insufficient funds.";
        }
    }

    public double getBalance() {
        return balance;
    }
}
