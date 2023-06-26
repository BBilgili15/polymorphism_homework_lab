import Payment.IChargeable;

public class GiftCard implements IChargeable {
    private double balance;

    public GiftCard(double balance){
        this.balance = balance;
    }

    public String getCharged(double price){
        this.balance -= price;
        return "You've paid";
    }

    public double getBalance() {
        return balance;
    }
}
