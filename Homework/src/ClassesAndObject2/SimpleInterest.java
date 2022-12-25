package ClassesAndObject2;
import java.util.Scanner;
public class SimpleInterest {
	
		void simpleinterest1(float p ,float r ,float t)
		{
			float si=(p*r*t)/100;
			System.out.println("Simple interest is : " +si);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner (System.in);
		 System.out.println("Enter Value");
		 float p=sc.nextFloat();
		 float r=sc.nextFloat();
		 float t=sc.nextFloat();
		  SimpleInterest si= new SimpleInterest ();
		  si.simpleinterest1(p, r, t);
		  

	}

}
