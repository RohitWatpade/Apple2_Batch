package ClassesAndObject2;

import java.util.Scanner;

public class Movie2 {
	
	int id ,yearrelease;
	String mname , producer;
	
		void setData(int i ,String n,int y, String p)
		{
			id=i;
			mname=n;
			yearrelease=y;
			producer=p;
		}
		void display()
		{
			System.out.println(id+" "+mname+" "+yearrelease+" "+producer);
		}
		
		public static void main(String[] args) {
		// Reference variable and Instance variable
	
		  Scanner sc=new Scanner(System.in);
		  Movie2 m1=new Movie2();
			
					//Scanner sc=new Scanner (System.in);
					System.out.println("Enter the id : ");
					int i=sc.nextInt();
					System.out.println("Enter the Movie name : ");
					String n=sc.next();
					System.out.println("Enter the Release year : ");
					int y=sc.nextInt();
					System.out.println("Enter the Produce name : ");
					String p=sc.next();
					
					
					
					m1.setData(i, n, y, p);
					m1.display();
}
		}
			