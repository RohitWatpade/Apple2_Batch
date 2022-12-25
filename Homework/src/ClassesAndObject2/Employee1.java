package ClassesAndObject2;
import java.util.Scanner;
public class Employee1 {
	
	int id;
	long contact;
	String name,dept;
	float salary;
	
	
	void setData(int i, String n ,String d,float s, long c)
	{
		id=i;
		name=n;
		dept=d;
		salary=s;
		contact=c;
		
	}
	
	void display()

	{
		System.out.println(id+" "+name+" "+dept+" "+salary+" "+contact);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		long c;
		String n,d;
		float s;
		
		Scanner sc=new Scanner(System.in);
		
		Employee1 e=new Employee1();
		System.out.println("Enter ID : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter Dept : ");
		d=sc.next();
		System.out.println("Enter Salary : ");
		s=sc.nextFloat();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e.setData(i, n, d, s, c);
		
		System.out.println("--------*****---------");
		
		Employee1 e1=new Employee1();
		System.out.println("Enter ID : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter Dept : ");
		d=sc.next();
		System.out.println("Enter Salary : ");
		s=sc.nextFloat();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e1.setData(i, n, d, s, c);
		
		System.out.println("--------*****---------");
		
		Employee1 e2=new Employee1();
		System.out.println("Enter ID : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter Dept : ");
		d=sc.next();
		System.out.println("Enter Salary : ");
		s=sc.nextFloat();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e2.setData(i, n, d, s, c);
		
		System.out.println("--------*****---------");
		
		Employee1 e3=new Employee1();
		System.out.println("Enter ID : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter Dept : ");
		d=sc.next();
		System.out.println("Enter Salary : ");
		s=sc.nextFloat();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e3.setData(i, n, d, s, c);
		
		System.out.println("--------*****---------");
		
		Employee1 e4=new Employee1();
		System.out.println("Enter ID : ");
		i=sc.nextInt();
		System.out.println("Enter name : ");
		n=sc.next();
		System.out.println("Enter Dept : ");
		d=sc.next();
		System.out.println("Enter Salary : ");
		s=sc.nextFloat();
		System.out.println("Enter contact : ");
		c=sc.nextLong();
		e4.setData(i, n, d, s, c);
		
		e.display();
		e1.display();
		e2.display();
		e3.display();
		e4.display();

	}

}
