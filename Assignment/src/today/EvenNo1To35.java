package today;
import java.util.Scanner;

public class EvenNo1To35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start , end ;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strat and end : ");
		start=sc.nextInt();
		end=sc.nextInt();
		while(start<=end)
		{
			if(start%2==0)
			{
			System.out.print(start+" ");
			}
			start++;
		}
		sc.close();

	}

}


