public class IT23692046Lab7Q2B {

    public static void main(String[] args) {
        // Loop for numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            // Print the number and hyphen
            System.out.print(i + " - ");

            // Inner loop to print stars corresponding to the current number
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}