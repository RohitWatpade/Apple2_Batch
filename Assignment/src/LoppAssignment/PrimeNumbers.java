package LoppAssignment;
// 11. Find all prime numbers between 400 to 300
public class PrimeNumbers {
	
public static void main(String[] args)
{
	int num1=400,num2=300,count=0;
	
    for( num1=400; num1>=num2;num1--)
{
	if(num1%2==0)
	{
		count=count+1;
	}
		System.out.print(count+" ");
}
}
}


