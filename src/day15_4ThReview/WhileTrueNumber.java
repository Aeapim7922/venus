package day15_4ThReview;
import java.util.Scanner;
public class WhileTrueNumber {
public static void main(String[] args) {
	
		 Scanner sc = new Scanner(System.in);
	      int input;
	      while (true) {
	         System.out.print("enter number between 1-100: ");
	         input = sc.nextInt();
	         if (input > 0 && input <= 100) break;
	         System.out.println("Number is not in 1-100 range");
	      }
	      System.out.println(input);
}
}
