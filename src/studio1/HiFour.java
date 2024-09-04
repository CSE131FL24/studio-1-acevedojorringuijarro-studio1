package studio1;

import java.util.Scanner;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s0 = in.nextLine(); 				//always introduce the variable before using it
		System.out.print("Hi " + s0 + ". How are you?");
		String s1 = in.nextLine();
		System.out.print("Hi " + s1 + ". How are you?");
		String s2 = in.nextLine();
		System.out.print("Hi " + s2 + ". How are you?");
		String s3 = in.nextLine();
		System.out.print("Hi " + s3 + ". How are you?");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
