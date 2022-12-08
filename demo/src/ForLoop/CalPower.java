package ForLoop;

import java.util.Scanner;

public class CalPower {
public static void main(String[] args) {
		
		int b,e,pow=1 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the base and exponent value : ");
		b=sc.nextInt();
		
		e=sc.nextInt();
		

		for(int i=1;i<=e;i++)
		{
			pow=pow*b;
		}
		System.out.println("power of " +pow);
		sc.close();
		
}
}
