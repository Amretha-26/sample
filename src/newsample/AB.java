package newsample;
import java.util.*;

//abstract class
abstract class Shapes         
{     //non-abstract method in an abstract class
double circle(int r)
{ 
  double area = (22*r*r)/7;
  return area;
}
    //abstract method
abstract double triangle(int b, int h);   
}

//abstract class is derived to override the abstract method
class RightTriangle extends Shapes       
{    
    //abstract method is overridden
double triangle(int b, int h)        
{
  double area = b*h/2;
  return area;
}
}

//abstract class is derived to override the abstract method
class EquilateralTriangle extends Shapes
{     //abstract method overridden again
double triangle(int b, int h)
{
  double area = 1.732*b*b/4;
  return area;
}
}


 

public class AB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes a;
		  Scanner sc = new Scanner(System.in);

		  System.out.println("Enter the base and height of the triangle ");
		  int base = sc.nextInt();
		  int height = sc.nextInt();
		  a = new RightTriangle();       //object is created to call method
		  System.out.println("Area of right triangle is"+a.triangle(base,height));
		 
		    a = new EquilateralTriangle ();
		  System.out.println("Enter the radius of the circle ");
		  int radius = sc.nextInt();
		  System.out.println("Area of circle is "+a.circle(radius));
		  System.out.println("Enter the side of the equilateral triangle ");
		  int side = sc.nextInt();
		  a = new EquilateralTriangle(); 
		  System.out.println("Area of equilateral triangle is"+a.triangle(side,side));

	}

}
