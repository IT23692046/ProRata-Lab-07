import java.util.Scanner;

public class IT23692046Lab7Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop for 5 customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("\n--- Customer " + i + " ---");
            
            // Prompt for total bill amount
            System.out.print("Enter total bill amount: ");
            double billAmount = scanner.nextDouble();

            // Prompt for mode of payment
            System.out.print("Enter mode of payment (C/c for Cash, O/o for Other): ");
            char paymentMode = scanner.next().charAt(0);

            double discount = 0.0;
            double amountToBePaid = billAmount;

            // Check if payment mode is valid
            if (paymentMode == 'C' || paymentMode == 'c') {
                // 5% discount for cash payments
                discount = billAmount * 0.05;
                amountToBePaid = billAmount - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else if (paymentMode == 'O' || paymentMode == 'o') {
                // No discount for other payment modes
                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else {
                // Display error message for invalid payment mode
                System.out.println("Payment Mode is Not Valid");
            }
        }

        scanner.close();
    }
}