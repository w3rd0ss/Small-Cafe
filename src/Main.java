public class Main {
    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("C-01", "Espresso", 9.0, "coffee");
        MenuItem m2 = new MenuItem("C-02", "Cappuccino", 13.5, "coffee");
        MenuItem m3 = new MenuItem("D-01", "Cheesecake", 16.0, "dessert");

        CafeCustomer customer = new CafeCustomer(100, "Julia", "Mazur", "j.mazur@mail.pl");

        Order order = new Order(customer);
        order.addItem(m1);
        order.addItem(m2);
        order.addItem(m3);

        System.out.println(customer);
        System.out.println();
        System.out.println(order);

        System.out.println();

        System.out.println("Total value: " + order.calculateTotal() + " PLN");
        System.out.println("Number of items in order: " + order.countItems());
        System.out.println("Total products registered in the cafe system: " + MenuItem.getProductCount());
        MenuItem espressoCopy = new MenuItem("C-01", "Espresso duplicate", 9.0, "coffee");
        System.out.println("\nAre the products equal (same code)? " + m1.equals(espressoCopy));
        order.markAsPaid();
        System.out.println("\n--- AFTER PAYMENT ---");
        System.out.println(order);
    }
}