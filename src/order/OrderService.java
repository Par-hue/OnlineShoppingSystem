package order; 

import adapter.PaymentService;
import logger.Logger;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Observer> observers = new ArrayList<>();
    private PaymentService paymentService;
    private Logger logger = Logger.getInstance();

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void placeOrder(double amount) {
        logger.log("Placing order...");
        paymentService.processPayment(amount);
        notifyObservers("Order confirmed for amount: $" + amount);
        logger.log("Order completed.");
    }
}


