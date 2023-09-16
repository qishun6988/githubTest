import javax.swing.JOptionPane;

public class Grade_GUI 
{
   public static void main(String args[])
   {
    
    String a=JOptionPane.showInputDialog ("PLEASE ENTER YOUR GRADE");
    char grade=a.charAt(0);
 
      switch(grade)
      {
         case 'A' :
         case 'a' :
            JOptionPane.showMessageDialog(null,"EXCELLENT\nYOUR GRADE IS A");
            break;
         case 'B' :
         case 'b' :
            JOptionPane.showMessageDialog(null,"GOOD\nYOUR GRADE IS B");
            break;
         case 'C' :
         case 'c' :
            JOptionPane.showMessageDialog(null,"GOOD\nYOUR GRADE IS C");
            break;
         case 'D' :
         case 'd' :
            JOptionPane.showMessageDialog(null,"PASS\nYOUR GRADE IS D");
            break;
         case 'E' :
         case 'e' :
            JOptionPane.showMessageDialog(null,"PASS\nYOUR GRADE IS E");
            break;
         case 'F' :
         case 'f' :
            JOptionPane.showMessageDialog(null,"YOU NEED TO STUDY HARDER\nYOUR GRADE IS F");
            break;
         case 'G' :
         case 'g' :
            JOptionPane.showMessageDialog(null,"YOU NEED TO STUDY HARDER\nYOUR GRADE IS G");
            break;
         default :
            JOptionPane.showMessageDialog(null,"UNKNOWN GRADE");
      }
   }
}