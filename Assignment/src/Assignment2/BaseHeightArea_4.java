package Assignment2;
import java.util.Scanner;
public class BaseHeightArea_4 {
	public static void main(String[] args) {
		int b,h,a ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the width and height");
		b= sc.nextInt();
		h= sc.nextInt();
		a = (b*h)/2;
		System.out.println("Area of Tringle" + a);
		sc.close();

}
}
