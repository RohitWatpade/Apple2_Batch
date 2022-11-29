package Assignment2;
import java.util.Scanner;
public class PerformAllOperations_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		int sum, sub, mul, div, mod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		a = sc.nextInt();
		b= sc.nextInt();
		sum = a + b;
		sub = a - b;
		mul = a * b; 
		div = a / b;
		mod = a % b;
		System.out.println("Sum = a+b= " + sum);
		System.out.println("Sub = a-b = " + sub);
		System.out.println("Mul = a+b= "+mul);
		System.out.println("Div = a/b = " + div);
		System.out.println("mod = alb = " + mod);
		
		
		sc.close();
	}

}



