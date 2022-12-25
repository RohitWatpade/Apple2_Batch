package ClassesAndObject2;
import java.util.Scanner;
public class AreaOfCircle {
	
	float radius(float r)
	{
	  float sq=r*r;
	
		System.out.println("Square is "  +sq);
		return(sq);
    }
	
	void area(float sq)
	{
		double area = 3.14*sq;
		System.out.println("Area of circle : " +area);
	}
	
	
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		float r;
		System.out.println("Enter area of circle : ");
		r= sc.nextFloat();
		
		AreaOfCircle a1= new AreaOfCircle();
		a1.area(a1.radius(r));
		
		sc.close();
		
	}
}
