package sampleproject;

public class OpetatorsDemo {
	
	public static void main(String[] args)
	{
		int a= 10, b=5, c=2;
		int ans = (c+a)%b ; 
		System.out.println(ans);
		
		//a = a=5 ;
		a += 5;
		System.out.println("odified valur of a : " + a);
		
		//Relational op
		int age =24;
		char ctz = 'p';
		boolean ans1 = (age>18) && (ctz=='p') ; 
		System.out.println("Decision to open accout : " + ans1);
		
		//Unary operators
		// ++a preincrement unary operators
		// a++ post increment unary operators
		
		int x=10;
		x++;
		System.out.println("x : " + x);
		
		int y=10;
		int z= y++; // increment available value of y first then use that value for
		     // your ourpose
		System.out.println("z : " + z);
		System.out.println("y : " + y);
	
		System.out.println("---------------------");
		int r=10;
		int s= ++r;
		
		System.out.println("s = " +s);
		System.out.println("r = " +r++);
		System.out.println("r = " +r);
	}
	
	

}
