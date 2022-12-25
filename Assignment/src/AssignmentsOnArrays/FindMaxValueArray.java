package AssignmentsOnArrays;

import java.util.Arrays;

//1. WAP to find 2nd max value in an array [20, 0, 31, 45, 100, 1, 105, 90] 
public class FindMaxValueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {20, 0, 31, 45, 100, 1, 105, 90};
		System.out.println(Arrays.toString(arr));
		
		for (int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) 
				{
				   int temp=arr[j]; // integer Array
				
				   arr[j]=arr[j+1];
				   arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("second maximum marks: "+arr[arr.length-2]);

	}

}
