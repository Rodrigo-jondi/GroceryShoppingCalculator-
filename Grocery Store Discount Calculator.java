import java.util.Scanner;

public class GroceryStoreDiscount {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the total purchase amount
        System.out.print("Enter the total purchase amount: PHP ");
        double totalAmount = scanner.nextDouble();

        // Initialize variables for discount and final price
        double discount = 0;
        double finalPrice;

        // Apply the appropriate discount using if-else conditions
        if (totalAmount >= 1000 && totalAmount <= 5000) {
            discount = 0.05; // 5% discount
        } else if (totalAmount > 5000 && totalAmount <= 10000) {
            discount = 0.10; // 10% discount
        } else if (totalAmount > 10000) {
            discount = 0.15; // 15% discount
        }

        // Calculate the final price after discount
        finalPrice = totalAmount - (totalAmount * discount);

        // Display the discount percentage and the final price
        System.out.println("Discount applied: " + (int)(discount * 100) + "%");
        System.out.printf("Final price after discount: PHP %.2f", finalPrice);
    }
}