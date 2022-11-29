package Assignment1;
import java.util.Scanner;

//Write a java program to find power of any number x^y.
public class PowerOfNumber_10 {
	public static void main(String[] args) {
		int x, y;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any numbers");
		x=sc.nextInt();
		y=sc.nextInt();
		
		double power = Math.pow(x,y);
		System.out.println("power of x^y is : " +power );
		
		sc.close();
	}

}
