package Interface;

interface Calculator
{
	void Addition(int a ,int b);
	void Multiplication(int a,int b);
	void Divison(int a,int b);
	void substraction(int a, int b);
	
}

class SciCalcultor implements Calculator
{
public void Addition (int a ,int b)
{
	System.out.println("Addition  is :"+(a+b));
}
public void Multiplication(int a,int b)
{
	System.out.println("Multiplication is : "+(a*b));
}
public void Divison(int a,int b)
{
	System.out.println("Divison is : "+(a/b));
}
public void  substraction(int a,int b){
	System.out.println("Substraction is : "+(a-b));
}

public void square(int a ,int b)
{
	System.out.println("Square is :"+(a*b));
}

public void power(int a, int b) {
	System.out.println("Power is : "+Math.pow(a,b));	
	
}
public void sqrt(int a, int b) {
	System.out.println("Square root is "+Math.sqrt(a));
}
}

public class Scicalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SciCalcultor sc=new SciCalcultor();
		sc.Addition(78, 78);
		sc.Multiplication(65,4);
		sc.Divison(7, 5);
		sc.substraction(12, 34);
		sc.power(45, 45);
		sc.square(78, 8);
		sc.sqrt(45, 1);
	}

}