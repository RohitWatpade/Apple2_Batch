package Assignment2;
import java.util.Scanner;
public class ConvertIntoMeterAndKilometer_7 {

    public static void main(String[] args) {
    float c,m,k;
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter the length in cent ter");
     c=sc.nextFloat();
     m = (float) (c /100);
     k = (float) (c /100000);
      System.out.println("Length in meter : " +m);
      System.out.println("Length in kilometers : " +k);
     
      sc.close();
    		  
    }
    }



