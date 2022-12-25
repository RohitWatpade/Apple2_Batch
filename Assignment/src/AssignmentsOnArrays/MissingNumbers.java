package AssignmentsOnArrays;
/*10. Write a Java program to find a missing number in an array. Means e.g. array has 1
to n element in sequence(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is
5 */
import java.util.Scanner;
public class MissingNumbers {
	public static void main(String[] args) {
	      /*Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the n value: ");
	      int n = sc.nextInt();
	      int inpuArray[] = new int[n];
	      System.out.println("Enter (n-1) numbers: ");
	      for(int i=0; i<=n-2; i++) {
	         inpuArray[i] = sc.nextInt();
	      }
	      //Finding the missing number
	      int sumOfAll = (n*(n+1))/2;
	      int sumOfArray = 0;
	      for(int i=0; i<=n-2; i++) {
	         sumOfArray = sumOfArray+inpuArray[i];
	      }
	      int missingNumber = sumOfAll-sumOfArray;
	      System.out.println("Missing number is: "+missingNumber);	   }
*/
		int arr[]= {1, 2, 3, 4, 6, 7};
		int j=1;
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]!=j)
			{
				System.out.println(j);
				j++;
			}
			j++;
		}
	}

}
