package today;

import java.util.Scanner;

public class AvgOfDigitsOFNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,r,sum=0,avg=0,count=0 ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers : ");
		num=sc.nextInt();
		
		while(num>0)
		{
			r=num%10;
			sum=sum+r;
			num=num/10;
			count++;
			avg=sum/count;
		}
		{
			System.out.println("Average : " +avg);
		}
		
		//System.out.println("Addidtion is : " +sum1);
sc.close();
	}

}
