import javax.swing.JOptionPane;

public class Rumus_GUI {
    public static void main(String[] args) {
        // Input coefficients A, B, and C using pop-up dialog boxes
        int a = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF C"));

        // Process the quadratic equation with the provided coefficients
        processQuadraticEquation(a, b, c);
    }

    private static void processQuadraticEquation(int a, int b, int c) {
        if (a == 0) {
            // If A is 0, it's not a valid quadratic equation
            JOptionPane.showMessageDialog(null, "THE VALUE OF A CANNOT BE 0.");
        } else {
            // Generate the quadratic equation string
            String equation = generateQuadraticEquation(a, b, c);
            
            // Display the quadratic equation to the user
            JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS: " + equation);

            // Calculate and display the roots of the equation
            calculateAndDisplayRoots(a, b, c);
        }
    }

    private static String generateQuadraticEquation(int a, int b, int c) {
        String p, q;

        if (a == 1) {
            // Handle the case where A is 1
            p = (b < 0) ? "x^2" + b + "x" : (b == 0) ? "x^2" : "x^2+" + b + "x";
        } else if (a == -1) {
            // Handle the case where A is -1
            p = (b < 0) ? "-x^2" + b + "x" : (b == 0) ? "-x^2" : "-x^2+" + b + "x";
        } else {
            // Handle other values of A
            p = (b < 0) ? a + "x^2" + b + "x" : (b == 0) ? a + "x^2" : a + "x^2+" + b + "x";
        }

        // Construct the constant part of the equation
        q = (c < 0) ? c + "=0" : (c == 0) ? "=0" : "+" + c + "=0";

        // Combine the parts to create the complete quadratic equation
        return p + q;
    }

    private static void calculateAndDisplayRoots(int a, int b, int c) {
        double d = (b * b) - (4 * a * c); // Calculate the discriminant
        double e = Math.sqrt(d); // Calculate the square root of the discriminant
        double f = -(b) + e; // Calculate the first root
        double rumus = f / (2 * a); // Calculate the value of the first root
        double g = -(b) - e; // Calculate the second root
        double h = g / (2 * a); // Calculate the value of the second root

        // Check if the roots are real numbers
        if (Double.isNaN(rumus) || Double.isNaN(h)) {
            JOptionPane.showMessageDialog(null, "THE ROOTS ARE NOT REAL.");
        } else if (rumus == h) {
            // If both roots are the same
            JOptionPane.showMessageDialog(null, "THE ROOT IS " + h + ".");
        } else {
            // If there are two distinct roots
            JOptionPane.showMessageDialog(null, "THE ROOTS ARE " + rumus + " AND " + h + ".");
        }
    }
}
