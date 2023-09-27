import javax.swing.JOptionPane;

public class Rumus_GUI {
    public static void main(String[] args) {

        // Input coefficients A, B, and C using pop-up dialog boxes
        int a = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF A"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF B"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF C"));

        // Check if the coefficient 'a' is equal to 0
        if (a == 0) {
            JOptionPane.showMessageDialog(null, "THE VALUE OF A CANNOT BE 0.");
        } else {
            // Check the value of coefficient 'b'
            if (b <= -1) {
                String p = "xx";
                // Check the value of coefficient 'c'
                if (c <= -1) {
                    String q = "x";
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + b + q + c + "=0");
                } else if (c == 0) {
                    String q = "";
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + b + q + "=0");
                } else {
                    String q = "x+";
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + b + q + c + "=0");
                }
            } else if (b == 0) {
                String p = "xx";
                // Check the value of coefficient 'c'
                if (c <= -1) {
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + c + "=0");
                } else if (c == 0) {
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + "=0");
                } else {
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + "+" + c + "=0");
                }
            } else if (b >= 1) {
                String p = "xx+";
                // Check the value of coefficient 'c'
                if (c <= -1) {
                    String q = "x";
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + b + q + c + "=0");
                } else if (c == 0) {
                    String q = "x";
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + b + q + "=0");
                } else {
                    String q = "x+";
                    JOptionPane.showMessageDialog(null, "YOUR QUADRATIC EQUATION IS : " + a + p + b + q + c + "=0");
                }
            }

            /* Calculation of roots */
            double d = (b * b) - (4 * a * c);
            double e = (Math.sqrt(d));
            double f = -(b) + e;
            double rumus = f / (2 * a);
            double g = -(b) - e;
            double h = g / (2 * a);

            // Check if the roots are real numbers
            if (Double.isNaN(rumus) || Double.isNaN(h)) {
                JOptionPane.showMessageDialog(null, "THE ROOTS ARE NOT REAL.");
            } else if (rumus == h) {
                JOptionPane.showMessageDialog(null, "THE ROOT IS " + h + ".");
            } else {
                JOptionPane.showMessageDialog(null, "THE ROOTS ARE " + rumus + " AND " + h + ".");
            }
        }
    }
}
