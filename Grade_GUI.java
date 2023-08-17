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
         case 'C' :
         case 'c' :
            if(grade=='B'||grade=='b')
            JOptionPane.showMessageDialog(null,"GOOD\nYOUR GRADE IS B");
            else
            JOptionPane.showMessageDialog(null,"GOOD\nYOUR GRADE IS C");
            break;
         case 'D' :
         case 'd' :
         case 'E' :
         case 'e' :
            if(grade=='D'||grade=='d')
            JOptionPane.showMessageDialog(null,"PASS\nYOUR GRADE IS D");
            else
            JOptionPane.showMessageDialog(null,"PASS\nYOUR GRADE IS E");
            break;
         case 'F' :
         case 'f' :
         case 'G' :
         case 'g' :
            if(grade=='F'||grade=='f')
            JOptionPane.showMessageDialog(null,"YOU NEED TO STUDY HARDER\nYOUR GRADE IS F");
            else
            JOptionPane.showMessageDialog(null,"YOU NEED TO STUDY HARDER\nYOUR GRADE IS G");
            break;
         default :
            JOptionPane.showMessageDialog(null,"UNKNOWN GRADE");
      }
   }
}