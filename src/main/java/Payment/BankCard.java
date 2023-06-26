package Payment;

public abstract class BankCard {
    private int cardNumber;
    private int expiryDate;
    private int securityNumber;

    public BankCard(int cardNumber, int expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

//    public abstract String getCharged();

    public int getCardNumber() {
        return cardNumber;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }
}
