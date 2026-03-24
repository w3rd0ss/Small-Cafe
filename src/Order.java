import java.util.ArrayList;

public class Order {
    private static int nextOrderNumber = 1;

    private int orderNumber;
    private CafeCustomer customer;
    private ArrayList<MenuItem> items;
    private boolean paid;

    public Order(CafeCustomer customer) {
        this.customer = customer;
        this.items = new ArrayList<>(); // Initialize the empty list for products
        this.paid = false;              // Orders start as unpaid

        this.orderNumber = nextOrderNumber;
        nextOrderNumber++;
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public int countItems() {
        return items.size();
    }

    public double calculateTotal() {
        double total = 0.0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void markAsPaid() {
        this.paid = true;
    }

    public static int getNextOrderNumber() {
        return nextOrderNumber;
    }

    @Override
    public String toString() {
        String status = paid ? "PAID" : "UNPAID";
        return String.format("--- ORDER #%d [%s] ---\nCustomer: %s\nItems: %d\nTotal Value: %.2f PLN\n-----------------------",
                orderNumber, status, customer.getFullData(), countItems(), calculateTotal());
    }
}