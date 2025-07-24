
import adapter.*;
import observer.*;
import order.*;

public class App {
    public static void main(String[] args) {
        PaymentService paymentService = new StripePaymentAdapter();
        OrderService orderService = new OrderService(paymentService);

        Observer notification = new NotificationService();
        Observer inventory = new InventoryService();

        orderService.addObserver(notification);
        orderService.addObserver(inventory);

        orderService.placeOrder(10.00);
    }
}
