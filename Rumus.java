import java.util.Scanner;

public class Rumus {
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
            // Calculate and display the roots
            calculateAndDisplayRoots(a, b, c);
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
                System.out.println("PLEASE ENTER A VALID NUMBER FOR " + variableName + ".");
                input.next(); // Clear the invalid input from the input buffer
            }
        }

        return value; // Return the valid user input
    }

    // Function to generate the quadratic equation string
    private static String generateQuadraticEquation(int a, int b, int c) {
        String p, q;

        // Construct the part of the equation related to 'x^2' and 'x'
        if (a == 1) {
            p = (b < 0) ? "x^2" + b + "x" : (b == 0) ? "x^2" : "x^2+" + b + "x";
        } else if (a == -1) {
            p = (b < 0) ? "-x^2" + b + "x" : (b == 0) ? "-x^2" : "-x^2+" + b + "x";
        } else {
            p = (b < 0) ? a + "x^2" + b + "x" : (b == 0) ? a + "x^2" : a + "x^2+" + b + "x";
        }

        // Construct the constant part of the equation
        q = (c < 0) ? c + "=0" : (c == 0) ? "=0" : "+" + c + "=0";

        // Combine the parts to create the complete quadratic equation
        return p + q;
    }

    private static void calculateAndDisplayRoots(int a, int b, int c) {
        /* Calculation of roots */
        double d = (b * b) - (4 * a * c); // Calculate the discriminant
        double e = (Math.sqrt(d)); // Calculate the square root of the discriminant
        double f = -(b) + e; // Calculate the first root
        double rumus = f / (2 * a); // Calculate the value of the first root
        double g = -(b) - e; // Calculate the second root
        double h = g / (2 * a); // Calculate the value of the second root

        // Check if the roots are real numbers
        if (Double.isNaN(rumus) || Double.isNaN(h)) {
            System.out.println("THE ROOTS ARE NOT REAL.");
        } else if (rumus == h) {
            System.out.println("THE ROOT IS " + h + ".");
        } else {
            System.out.println("THE ROOTS ARE " + rumus + " AND " + h + ".");
        }
    }
}
