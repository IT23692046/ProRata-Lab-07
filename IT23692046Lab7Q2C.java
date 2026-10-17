public class IT23692046Lab7Q2C {

    public static void main(String[] args) {
        // Outer loop counting down from 5 to 1
        for (int i = 5; i >= 1; i--) {
            // Inner loop running i times to print the number i
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            // Move to the next line
            System.out.println();
        }
    }
}