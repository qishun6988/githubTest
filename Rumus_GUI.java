import javax.swing.JOptionPane;

public class Rumus_GUI {
    public static void main(String[] args){

       int a = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF A"));

       int b = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF B"));

       int c = Integer.parseInt(JOptionPane.showInputDialog("PLEASE ENTER THE VALUE OF C"));

       JOptionPane.showMessageDialog(null,"YOUR QUADRATIC EQUATION IS : "+a+"xx+"+b+"x+"+c);

       /*calculation*/
       double d=(b*b)-(4*a*c);
       double e=(Math.sqrt(d));
       double f=-(b)+e;
       double rumus=f/(2*a);
       double g=-(b)-e;
       double h=g/(2*a);

       if (Double.isNaN(rumus) || Double.isNaN(h)) 
       {
        JOptionPane.showMessageDialog(null,"THE EQUATION DOES NOT HAVE ROOTS");
       }
       else
       {
        JOptionPane.showMessageDialog(null,"BY USING FORMULA, YOUR ANSWER IS :"+ rumus+" AND "+ h);
       }
        
    }
    
}
