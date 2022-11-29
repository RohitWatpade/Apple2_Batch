package Assignment1;
import java.util.Scanner;

// write a java program to enter P,T,R and calculate compound interest
public class CalculateCompoundInterest_17 {
	public static void main(String[] args) {
		float p , t ,r , ci;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter P T R");
		p=sc.nextFloat();
		t=sc.nextFloat();
		r=sc.nextFloat();
		
		ci=(float)(p *(Math.pow((1 +r/100),t)));
		System.out.println("Compound interest is : " +ci);
		sc.close();
		
		
	}

}
