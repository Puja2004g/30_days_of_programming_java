import java.util.*;
// import java.io.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
Difference(int[] arr){
        elements=arr;
        maximumDifference=0;
    }

    int computeDifference(){
         int n = elements.length-1;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(maximumDifference < Math.abs(elements[i]-elements[j+1])){
                    maximumDifference = Math.abs(elements[i]-elements[j+1]);
                }
            }
        }
        return  maximumDifference;
    }
} // End of Difference class

public class day_14_maximum_difference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}