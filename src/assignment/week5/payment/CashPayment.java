package assignment.week5.payment;

public class CashPayment implements Payable {
    private final String payer;

    public CashPayment(String payer) {
        this.payer = payer;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paying in cash amount of " + amount + " from " + payer);
    }
}
