import java.util.Scanner;

public class IT23692046Lab7Q1A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables for marks and average
        double mark1, mark2, mark3, mark4, average;

        // Prompt user to enter marks for four subjects
        System.out.print("Enter marks for Subject 1: ");
        mark1 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        mark2 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        mark3 = scanner.nextDouble();

        System.out.print("Enter marks for Subject 4: ");
        mark4 = scanner.nextDouble();

        // Calculate the average
        average = (mark1 + mark2 + mark3 + mark4) / 4.0;

        // Determine the grade based on average
        String grade;
        if (average >= 75 && average <= 100) {
            grade = "Distinction";
        } else if (average >= 50 && average < 75) {
            grade = "Credit";
        } else if (average >= 0 && average < 50) {
            grade = "Fail";
        } else {
            grade = "Invalid Marks Entered";
        }

        // Display the results
        System.out.println("\n-------------------------");
        System.out.println("Average Mark : " + average);
        System.out.println("Overall Grade: " + grade);
        System.out.println("-------------------------");

        scanner.close();
    }
}