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
         case 'C' :
         case 'c' :
            if(grade=='B'||grade=='b')
            System.out.println("GOOD\nYOUR GRADE IS B");
            else
            System.out.println("GOOD\nYOUR GRADE IS C");
            break;
         case 'D' :
         case 'd' :
         case 'E' :
         case 'e' :
            if(grade=='D'||grade=='d')
            System.out.println("PASS\nYOUR GRADE IS D");
            else
            System.out.println("PASS\nYOUR GRADE IS E");
            break;
         case 'F' :
         case 'f' :
         case 'G' :
         case 'g' :
            if(grade=='F'||grade=='f')
            System.out.println("YOU NEED TO STUDY HARDER\nYOUR GRADE IS F");
            else
            System.out.println("YOU NEED TO STUDY HARDER\nYOUR GRADE IS G");
            break;
         default :
            System.out.println("UNKNOWN GRADE");
      }
      scanner.close();
   }
}