package siri;
import java.util.Scanner;

public class sumandaverage {
	public static void main(String []args)
    		{
			int i, n = 0, s = 0;
			double avg;
			System.out.println("Input the 5 numbers : ");
			Scanner in = new Scanner(System.in);
			for (i = 0; i < 5; i++) {
				n = in.nextInt();

				s += n;
			}
			avg = s / 5;
System.out.println("The sum of 5 no is : " + s );
System.out.println("\nThe Average is : " + avg);
		}  
}
