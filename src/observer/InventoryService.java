package observer;

public class InventoryService implements Observer {
    public void update(String event) {
        System.out.println("Inventory updated for event: " + event);
    }
}
