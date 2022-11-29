
package today;

import java.util.Scanner;

public class EvenAndOddNumberAddition {

	public static void main(String[] args) {
		
		
		int num,even=0,odd=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		
		num=sc.nextInt();
		
		while(num>odd)
		{
			int digit=num%10;
		   if (digit%2==0)
		   {
			   even=even+digit;
		   }
		  
		   else
		   {
			   odd=odd+digit;
		   }
		   num=num/10;
		}
		
		  System.out.println("Addition of even no is : " +even);
		  System.out.println("Addition of odd no is : " +odd);
		  
		sc.close();
	}
}
