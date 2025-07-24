package adapter;

public class StripeAPI {
    public void makeStripePayment(double amount) {
        System.out.println("Processing payment through Stripe: $" + amount);
    }
}
