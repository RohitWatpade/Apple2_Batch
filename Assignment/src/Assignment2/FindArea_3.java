package Assignment2;
import java.util.Scanner;
public class FindArea_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int width, height, area; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter the width and height");
width= sc.nextInt();
height = sc.nextInt();
area = width * height;
System.out.println("Area of TRINGLE "+ area);
sc.close();
}
}

