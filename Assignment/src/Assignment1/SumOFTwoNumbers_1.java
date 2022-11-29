package Assignment1;
import java.util.Scanner;

//1. Write a java program to enter two numbers and find their sum
public class SumOFTwoNumbers_1 {
	
	
		public static void main(String[] args) {
			int a,b,c;
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Two Numbers");
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a+b ;
			System.out.println("Addision is :" +c+"is possion");
			
			sc.close();
			
		}
}



