import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        int a, b, c; // Declare variables to store coefficients A, B, and C of a quadratic equation

        // Get valid input for coefficients A, B, and C using a user-defined function
        a = getUserInput(input, "A");
        b = getUserInput(input, "B");
        c = getUserInput(input, "C");

        // Check if 'a' is equal to 0; if so, it's not a valid quadratic equation
        if (a == 0) {
            System.out.println("THE VALUE OF A CANNOT BE 0.");
        } else {
            // Generate and display the quadratic equation
            String equation = generateQuadraticEquation(a, b, c);
            System.out.println("YOUR QUADRATIC EQUATION IS: " + equation);
        }

        // Close the Scanner to free up resources
        input.close();
    }

    // Function to get valid user input for a coefficient
    private static int getUserInput(Scanner input, String variableName) {
        int value;

        while (true) {
            System.out.println("PLEASE ENTER THE VALUE OF " + variableName);
            try {
                value = input.nextInt(); // Attempt to read an integer from the user
                System.out.println("THE VALUE OF " + variableName + " IS " + value);
                break; // Exit the loop if input is valid
            } catch (Exception e) {
                // If the input is not a valid integer, catch the exception and provide an error message
                System.out.println("PLEASE ENTER A NUMBER INSTEAD OF LETTERS OR SYMBOLS");
                input.next(); // Clear the invalid input from the input buffer
            }
        }

        return value; // Return the valid user input
    }

    // Function to generate the quadratic equation string
    private static String generateQuadraticEquation(int a, int b, int c) {
        String p, q;

        // Construct the part of the equation related to 'x^2' and 'x'
        if (b < 0) {
            p = a + "xx" + b + "x";
        } else if (b == 0) {
            p = a + "xx";
        } else {
            p = a + "xx+" + b + "x";
        }

        // Construct the constant part of the equation
        if (c < 0) {
            q = c + "=0";
        } else if (c == 0) {
            q = "=0";
        } else {
            q = "+" + c + "=0";
        }

        // Combine the parts to create the complete quadratic equation
        return p + q;
    }
}
