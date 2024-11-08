import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private int id;
    private String name;
    private double price;

    public Item(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Order {
    private int id;
    private List<Item> items;

    public Order(int id) {
        this.id = id;
        this.items = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateAverageCost() {
        if (items.isEmpty()) {
            return 0.0;
        }

        double totalCost = 0.0;
        for (Item item : items) {
            totalCost += item.getPrice();
        }

        return totalCost / items.size();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an order
        System.out.print("Enter the order ID: ");
        int orderId = scanner.nextInt();
        Order order = new Order(orderId);

        // Read item details from the keyboard and add them to the order
        while (true) {
            System.out.print("Enter item ID (or -1 to finish): ");
            int itemId = scanner.nextInt();
            if (itemId == -1) {
                break;
            }

            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter item name: ");
            String itemName = scanner.nextLine();

            System.out.print("Enter item price: ");
            double itemPrice = scanner.nextDouble();

            Item item = new Item(itemId, itemName, itemPrice);
            order.addItem(item);
        }

        // Calculate and display the average cost of items in the order
        double averageCost = order.calculateAverageCost();
        System.out.println("Average Cost of Items in Order " + order.getId() + ": $" + averageCost);

        scanner.close();
    }
}