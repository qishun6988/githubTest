import java.util.Scanner;

public class Rumus
{
public static void main(String[]args)
{
  Scanner input=new Scanner(System.in);
  System.out.println("PLEASE ENTER THE VALUE OF A");
  int a =input.nextInt();
  
  System.out.println("PLEASE ENTER THE VALUE OF B");
  int b=input.nextInt();
  
  System.out.println("PLEASE ENTER THE VALUE OF C");
  int c=input.nextInt();

  System.out.println("YOUR QUADRATIC EQUATION IS : "+a+"xx+"+b+"x+"+c+"=0");
  
  double d=(b*b)-(4*a*c);
  double e=(Math.sqrt(d));
  double f=-(b)+e;
  double rumus=f/(2*a);
  double g=-(b)-e;
  double h=g/(2*a);

  if (Double.isNaN(rumus) || Double.isNaN(h)) 
  {
    System.out.println("THE EQUATION DOES NOT HAVE ROOTS");
  }
  else
  {
    System.out.println("BY USING FORMULA, YOUR ANSWER IS :"+ rumus+" AND "+ h);
  }
    }
}