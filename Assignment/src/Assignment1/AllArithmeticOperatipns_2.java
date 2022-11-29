package Assignment1;
//Write a java program to enter two numbers and perform all arithmetic operations. 
import java.util.Scanner;

public class AllArithmeticOperatipns_2 {
	public static void main(String[] args) {
		int a,b,add,sub,mult,div,mod;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		 
		add=a+b ;
		System.out.println("Addision is : " +add+" is possion");
		
		sub=a-b ;
		System.out.println("Substraction is : " +sub+" is possion");
	   
		mult=a*b ;
		System.out.println("Multiplication is : " +mult+" is possion");
	
		div=a/b ;
		System.out.println("Divission is : " +div+" is possion");
		
		mod=a%b ;
		System.out.println("Modulus is : " +mod+" is possion");
		
		sc.close();
	}
	
	
	

}

