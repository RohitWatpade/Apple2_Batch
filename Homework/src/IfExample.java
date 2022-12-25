import java.util.Scanner;

public class IfExample {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Marks");
		int m = sc.nextInt();
	 
		if(m>=75) {
			
				System.out.println("Distiction");
				
		}
		else if(m>=60) {
			
				System.out.println("First class");
		}
		else if(m>=55)
		{
				System.out.println("secound class");
		}
		else if(m>=50)
		{
				System.out.println("higher class");
		}
			
			
		
	else
		{
		  System.out.println("fail");	
		}
       sc.close();
		
	}
	

}
