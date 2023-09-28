import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Initialize grade as a single space character
        char grade = ' ';

        // Keep prompting the user for a grade until a valid one is entered
        while (grade == ' ' || grade == '\t' || grade == '\n') {
            System.out.print("PLEASE ENTER YOUR GRADE: "); // Prompt the user for input
            String input = scanner.nextLine(); // Read the user's input as a string

            // Check if the input length is 1 or 2 characters
            if (input.length() == 1 || input.length() == 2) {
                grade = input.charAt(0); // Assign the first character to 'grade'
            } else {
                System.out.println("PLEASE ENTER VALID GRADES IN MALAYSIA’S GRADING SYSTEM");
                // Display an error message if the input is not 1 or 2 characters long
            }
        }

        // Use a switch statement to determine and display a message based on the grade
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("EXCELLENT\nYOUR GRADE IS A");
                break;
            case 'B':
            case 'b':
                System.out.println("GOOD\nYOUR GRADE IS B");
                break;
            case 'C':
            case 'c':
                System.out.println("GOOD\nYOUR GRADE IS C");
                break;
            case 'D':
            case 'd':
                System.out.println("PASS\nYOUR GRADE IS D");
                break;
            case 'E':
            case 'e':
                System.out.println("PASS\nYOUR GRADE IS E");
                break;
            case 'F':
            case 'f':
                System.out.println("YOU NEED TO STUDY HARDER\nYOUR GRADE IS F");
                break;
            case 'G':
            case 'g':
                System.out.println("YOU NEED TO STUDY HARDER\nYOUR GRADE IS G");
                break;
            default:
                System.out.println("PLEASE ENTER VALID GRADES IN MALAYSIA’S GRADING SYSTEM");
                // Display an error message for an invalid grade
        }

        // Close the Scanner to free up resources
        scanner.close();
    }
}
