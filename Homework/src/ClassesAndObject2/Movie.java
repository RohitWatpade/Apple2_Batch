package ClassesAndObject2;

import java.util.Scanner;

public class Movie {
	
	void movie() {
	
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id : ");
			int id=sc.nextInt();
			System.out.println("Enter the Movie name : ");
			String m=sc.next();
			System.out.println("Enter the Release year : ");
			String y=sc.next();
			System.out.println("Enter the Producer name : ");
			int p=sc.nextInt();
			System.out.println(id+" "+m+" "+y+" "+p);
	}

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		m.movie();
		Movie m1=new Movie();
		m1.movie();

	}

}
