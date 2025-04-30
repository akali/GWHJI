package assignment.week5.payment;

import java.util.Random;

public class Main {
    private static Random random = new Random();

    public static void runPayment(Payable[] payables) {
        for (Payable payable : payables) {
            payable.pay(random.nextDouble(0, 100));
        }
    }

    public static void main(String[] args) {
        Payable[] accounts = new Payable[]{
                new CashPayment("Andrew"),
                new CreditCardPayment("Jane"),
                new CashPayment("John"),
                new CreditCardPayment("Jasmine"),
        };

        runPayment(accounts);
    }
}
