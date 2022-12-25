package ClassesAndObject2;

public class Employee {
	
	float hike(float salary,char rating)
	{
		float hike=0,newsal=0;
		System.out.println("salary : " +salary);
		if(rating=='A' || rating=='a')
		{
			hike=salary*0.2f;
			newsal=salary+hike;	
		}
		else if (rating=='B' || rating=='b')
		{
			hike=salary*0.15f;
			newsal=salary+hike;	
		}
		else if (rating=='C' || rating=='c')
		{
			hike=salary*0.1f;
			newsal=salary+hike;	
		}
		else
		{
			System.out.println("Soory ... pooer rating no incrment ...!!!");
		}
		System.out.println("Hike % : " +hike);
		System.out.println("Hike salary : " +newsal);
		return newsal;
	}
	
	void pfCalculate(float salary)
	{
		float pf =salary*0.15f;
		System.out.println("pf : " +pf);
		System.out.println("New salary : " +(salary-pf));
	} 
	
	void bonus(float salary)
	{
		float ebonus=salary*0.25f;
		System.out.println("Bonus is : " +ebonus);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee p1 = new Employee();
		float newsalary = p1.hike(50000, 'A');
				p1.pfCalculate(newsalary);
				p1.bonus(newsalary);
		
				System.out.println("------*********------");
		Employee p2 = new Employee();
		newsalary = p2.hike(70000, 'B');
				p2.pfCalculate(newsalary);
				p2.bonus(newsalary);
	}

}
