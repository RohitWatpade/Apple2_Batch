package AssignmentsOnArrays;
/*12.WAP to replace all the 0’s with 1’s in your array. Your array is [26, 0, 67, 45, 0, 78,
54, 34, 10, 0, 34] */
import java.util.Scanner;
public class Replace0To1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter the number : ");		
		int number = sc.nextInt();

		String str = Integer.toString(number);
		int len = str.length();
		String str1 = "";
		
		for(int i = 0 ; i < len ; i++)
		{
			if(str.charAt(i) == '0')
				str1 = str1 + '1';
			else
				str1 = str1 + str.charAt(i);	
		}
		System.out.println("Converted number is: "+str1);

		sc.close();									
	}
}
	

