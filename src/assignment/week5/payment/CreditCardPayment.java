package assignment.week5.payment;

public class CreditCardPayment implements Payable {
    private final String owner;

    public CreditCardPayment(String owner) {
        this.owner = owner;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paying with credit card amount of " + amount + " from " + owner);
    }
}
