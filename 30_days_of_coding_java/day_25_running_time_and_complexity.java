// import java.io.*;
import java.util.*;

public class day_25_running_time_and_complexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long n;
        int t;
        t=sc.nextInt();
        
        for(int j=0;j<t;j++){
            boolean isPrime=true;
            n=sc.nextLong();
            if(n==1){
                isPrime=false;
            }
            else{
                for(int i=2;i*i<=n;i++){
                    if(n%i==0){
                        isPrime=false;
                        break;
                    }
                    else{
                        isPrime=true;
                    }
                }
            }
            if(!isPrime){
                System.out.println("Not prime");
            }
            else{
                System.out.println("Prime");
            }
        }
        sc.close();
    }
}