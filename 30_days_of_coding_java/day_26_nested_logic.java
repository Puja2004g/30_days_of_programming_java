// import java.io.*;
import java.util.*;

public class day_26_nested_logic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int d1,d2,m1,m2,y1,y2,fine=0;
        Scanner sc=new Scanner(System.in);
        
        d1=sc.nextInt();
        m1=sc.nextInt();
        y1=sc.nextInt();
        d2=sc.nextInt();
        m2=sc.nextInt();
        y2=sc.nextInt();
        
        sc.close();
        
        if(d1==d2 && m1==m2 && y1==y2){
            fine=0;
        }
    
        if(d1<d2 && m1<m2 && y1<y2){
            fine=0;
        }
        
        if(d1>d2){
            if(m1==m2 && y1==y2){
                fine=15*(d1-d2);
            }
        }
        
        if(m1>m2){
            if(y1==y2){
                fine=500*(m1-m2);
            }
        }
        
        if(y1>y2){
            fine=10000;
        }
        
        System.out.println(fine);
    }
}