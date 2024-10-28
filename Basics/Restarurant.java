package practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Restarurant {

    // Menu items and their prices
    private static final Map<String, Double> menu = new HashMap<>();

    static {
        menu.put("Burger", 5.99);
        menu.put("Pizza", 8.99);
        menu.put("Pasta", 7.49);
        menu.put("Salad", 4.99);
        menu.put("Soda", 1.99);
    }

    // Method to display the menu
    public static void displayMenu() {
        System.out.println("Menu:");
        for (Map.Entry<String, Double> entry : menu.entrySet()) {
            System.out.printf("%s - $%.2f%n", entry.getKey(), entry.getValue());
        }
        System.out.println();
    }

    // Method to generate the bill
    public static double generateBill(String[] orderedItems) {
        double total = 0.0;
        System.out.println("Your Order:");
        for (String item : orderedItems) {
            if (menu.containsKey(item)) {
                total += menu.get(item);
                System.out.printf("%s - $%.2f%n", item, menu.get(item));
            } else {
                System.out.printf("%s - Item not found in the menu.%n", item);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        displayMenu();

        System.out.println("Please enter your order (comma-separated):");
        String input = scanner.nextLine();
        String[] orderedItems = input.split(",");

        // Trim spaces from the ordered items
        for (int i = 0; i < orderedItems.length; i++) {
            orderedItems[i] = orderedItems[i].trim();
        }

        // Generate and display the bill
        double totalBill = generateBill(orderedItems);
        System.out.printf("Total Bill: $%.2f%n", totalBill);

        scanner.close();
    }
}
