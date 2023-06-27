package Payment;

public class CreditCard extends BankCard implements IChargeable{
        private double availableCredit;

        public CreditCard(int cardNumber, int expiryDate, int securityNumber, double availableCredit){
            super(cardNumber, expiryDate, securityNumber);
            this.availableCredit = availableCredit;
         }

        public String getCharged(double price){
            double priceWithPercentage = price * 1.01;
            if (priceWithPercentage < availableCredit) {
                this.availableCredit -= priceWithPercentage;
                return "You've been charged £" + priceWithPercentage + ". £" + availableCredit + " remaining balance.";
            } else {
                return "Insufficient credit.";
            }
        }



    }


