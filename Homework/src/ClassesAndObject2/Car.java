package ClassesAndObject2;

import java.util.Scanner;

public class Car {
	
	int id ,price,launchyear;
	String name , company;
	
		void setData(int i ,int p,String n,int yr, String c)
		{
			id=i;
			price=p;
			name=n;
			launchyear=yr;
			company=c;
			
		}
		public String toString()
		{
			return id+" "+price+" "+name+" "+launchyear+" "+company ;
		}
		public static void main(String[] args) {
		// Reference variable and Instance variable
				int id, price , yr;
				String name, c;
					Scanner sc=new Scanner (System.in);
					System.out.println("Enter the id : ");
					id=sc.nextInt();
					System.out.println("Enter the price : ");
				    price=sc.nextInt();
					
					System.out.println("Enter the car name : ");
					name=sc.next();
					System.out.println("Enter the launchyear : ");
					yr=sc.nextInt();
					System.out.println("Enter the Company name : ");
			        c=sc.next();
					
					Car c1=new Car();
					
					c1.setData(id, price, name, yr, c); 
					
					System.out.println(c1);
}
		}
			