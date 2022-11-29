package Assignment2;
import java.util.Scanner;
public class SumOfTwoNumbers_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y, sum ;
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter the x ant y values");
			x=sc.nextInt(); 
			y=sc.nextInt();
			sum = x + y;
			System.out.println("Sum of the x and y "+sum);
			sc.close();
	}

}


