package AssignmentsOnArrays;
/*3.WAP to print the array in reverse order. E.g. arr[] = [3, 90, 45, 29, 37, 78] so your
output must be 78, 37, 29, 45, 90, 3*/
import java.util.Scanner;

public class ReversArray {
	void reverse(int a[])
	{
		System.out.println("Array in revers order");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}

        ReversArray r= new ReversArray();
		r.reverse(arr);

	

	}

}

	
