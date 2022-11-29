package Assignment1;
import java.util.Scanner;

// write a program to enter any number and calculate its square root.
public class CalculateSquareRoot_11 {
	public static void main(String[] args) {
		double num , sr;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Number");
		num=sc.nextDouble();
		
		sr=(double) Math.sqrt(num);
				
		System.out.println("Square root is : " +sr);
		sc.close();
	}

}
