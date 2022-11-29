package Assignment1;
import java.util.Scanner;

// write a java program to calculate area of an equilateral tringle.
public class CalculateAreaOfEquilateralTringle_14 {
	public static void main(String[] args) {
		float a ;
		double area ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Number : ");
		a=sc.nextFloat();
		
		area = (1.73* a * a)/4 ; 
		System.out.println("Area of Equilateral : " +area);
	  
		sc.close();
	}

}
