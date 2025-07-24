package adapter;

public class StripePaymentAdapter implements PaymentService {
    private StripeAPI stripeAPI = new StripeAPI();

    public void processPayment(double amount) {
        stripeAPI.makeStripePayment(amount);
    }
}
