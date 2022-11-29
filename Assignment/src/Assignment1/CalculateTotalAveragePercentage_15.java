package Assignment1;
import java.util.Scanner;

// Write a java porogram to enter marks of five subject and calculate total , average and percentage.
public class CalculateTotalAveragePercentage_15 {
	public static void main(String[] args) {
		int s1 , s2 , s3 , s4 , s5 , total , average ;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Subject marks-");
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		
		total = s1 + s2 + s3 + s4 + s5 ;
		average= total/5;
		float percentage= (total *100)/500f;
		
		System.out.println("Total marks is : " +total);
		System.out.println("total average marks : " +average);
		System.out.println("percentage of marks : " +percentage );
		
		sc.close();
	} 

}
