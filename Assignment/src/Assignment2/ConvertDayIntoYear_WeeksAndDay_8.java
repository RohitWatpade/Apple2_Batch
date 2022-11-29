package Assignment2;
import java.util.Scanner;

//Write a java program to convert day into year, weeks and days.

public class ConvertDayIntoYear_WeeksAndDay_8 {
	public static void main(String[] args) {
		int days , weeks , years;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a days : ");
		days=sc.nextInt();
		
		years = (days / 365);
		weeks = (days/7)  ;
	   
	    
	    System.out.println("Days of years : " +years);
       System.out.println("Days of  weeks : " +weeks);
       System.out.println("Days : " +days);
       
       sc.close();
	}

}
