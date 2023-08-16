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

    if (a==0)
    {
      System.out.println("THE VALUE OF A CANNOT BE 0.");
    }
    else
    {   
      if (b<=-1)
      {
        String p = "xx";
        if (c<=-1)
        {
          String q = "x";
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+b+q+c+"=0");
        }
        else if (c==0)
        {
          String q = "";
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+b+q+"=0");
        }
        else 
        {
          String q = "x+";
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+b+q+c+"=0");
        }
      }
      else if (b==0)
      {
        String p = "xx";
        if (c<=-1)
        {
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+c+"=0");
        }
        else if (c==0)
        {
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+"=0");
        }
        else 
        {
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+"x"+c+"=0");
        }
      }
        else if (b>=1)
      {
        String p = "xx+";
        if (c<=-1)
        {
          String q = "x";
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+b+q+c+"=0");
        }
        else if (c==0)
        {
          String q = "";
          System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+b+q+"=0");
        }
        else 
        {
        String q = "x+";
        System.out.println("YOUR QUADRATIC EQUATION IS : "+a+p+b+q+c+"=0");
        }
      }
      
      /*calculation*/
      double d=(b*b)-(4*a*c);
      double e=(Math.sqrt(d));
      double f=-(b)+e;
      double rumus=f/(2*a);
      double g=-(b)-e;
      double h=g/(2*a);

      if (Double.isNaN(rumus) || Double.isNaN(h)) 
      {
        System.out.println("THE ROOTS ARE NOT REAL.");
      }
      else if (rumus==h)
      {
        System.out.println("THE ROOT IS "+ h +".");
      } 
      else
      {
        System.out.println("THE ROOTS ARE " + rumus + " AND " + h +".");
      }
    }
    input.close();
  }
}
