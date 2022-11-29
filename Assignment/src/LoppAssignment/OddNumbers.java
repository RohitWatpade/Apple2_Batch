// 2.WAP to print odd numbers from 521 to 229 using while loop.
package LoppAssignment;



public class OddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int start , end ;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the strat and end : ");
//		start=sc.nextInt();
//		end=sc.nextInt();
//		while(start<=end)
//		{
//			if(start%2!=0)
//			{
//			System.out.print(start+" ");
//			}
//			start++;
//		}
//		System.out.println("Done");
//		sc.close();
		
		for (int num1=521; num1>=229; num1--)
		{
		if (num1%2!=0)
		System.out.print(num1+ " ");
		}

	}

}