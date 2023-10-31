// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class day_1_data_type {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j = scan.nextInt();
        double e = scan.nextDouble();
        scan.nextLine(); // Consume the newline character
        String str = scan.nextLine(); // Read the String input
        
        /* Read and save an integer, double, and String to your variables.*/
        /* Print the sum of both integer variables on a new line. */
        int sum_int = i + j;
        /* Print the sum of the double variables on a new line. */
        double sum_double = d + e;
        /* Concatenate and print the String variables on a new line; 
           the 's' variable above should be printed first. */
            
        System.out.println(sum_int);
        System.out.println(sum_double);
        System.out.println(s + str);
        scan.close();
    }
}