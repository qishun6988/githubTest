import java.util.Scanner;

public class Grade {
   public static void main(String args[]){
      
    Scanner scanner = new Scanner(System.in);
      
      System.out.println("PLEASE ENTER YOUR GRADE");
      char grade = scanner.next().charAt(0);
 
      switch(grade)
      {
         case 'A' :
         case 'a' :
            System.out.println("EXCELLENT\nYOUR GRADE IS A");
            break;
         case 'B' :
         case 'b' :
            System.out.println("GOOD\nYOUR GRADE IS B");
            break;
         case 'C' :
         case 'c' :
            System.out.println("GOOD\nYOUR GRADE IS C");
            break;
         case 'D' :
         case 'd' :
            System.out.println("PASS\nYOUR GRADE IS D");
            break;
         case 'E' :
         case 'e' :
            System.out.println("PASS\nYOUR GRADE IS E");
            break;
         case 'F' :
         case 'f' :
            System.out.println("YOU NEED TO STUDY HARDER\nYOUR GRADE IS F");
            break;
         case 'G' :
         case 'g' :
            System.out.println("YOU NEED TO STUDY HARDER\nYOUR GRADE IS G");
            break;
         default :
            System.out.println("UNKNOWN GRADE");
      }
      scanner.close();
   }
}