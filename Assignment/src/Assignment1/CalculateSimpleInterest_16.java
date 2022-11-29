package Assignment1;
import java.util.Scanner;

// write a java program enter P,T,R and calculate simple interest
public class CalculateSimpleInterest_16 {
	public static void main(String[] args) {
		int p, r, t, si;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		p=sc.nextInt();
		r=sc.nextInt();
		t=sc.nextInt();
		
		si=(p*r*t)/100 ;
		System.out.println("Simple Interest " +si);
		
		sc.close();
	}

}
