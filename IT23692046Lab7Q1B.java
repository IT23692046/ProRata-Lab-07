import java.util.Scanner;

public class IT23692046Lab7Q1B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop to process marks for 3 students
        for (int student = 1; student <= 3; student++) {
            System.out.println("\nEnter marks for 4 subjects for Student " + student + " (separated by space):");
            
            // Read 4 subject marks from a single line
            double mark1 = scanner.nextDouble();
            double mark2 = scanner.nextDouble();
            double mark3 = scanner.nextDouble();
            double mark4 = scanner.nextDouble();

            // Calculate the average
            double average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            // Determine the grade based on the average
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

            // Display results for the current student
            System.out.println("-------------------------");
            System.out.println("Average Mark : " + average);
            System.out.println("Overall Grade: " + grade);
            System.out.println("-------------------------");
        }

        scanner.close();
    }
}