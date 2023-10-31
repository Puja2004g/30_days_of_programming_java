// import java.io.*;
import java.util.*;

public class day_6_lets_review {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        sc.nextLine();
        for(int j=0;j<T;j++){
            String str=sc.nextLine();
            for(int i=0;i<str.length();i++){
                if(i%2==0){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.print(" ");
            for(int i=0;i<str.length();i++){
                if(i%2!=0){
                    System.out.print(str.charAt(i));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}