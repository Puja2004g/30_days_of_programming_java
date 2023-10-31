import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

public class day_10_binary_numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        ArrayList<Integer> binary_value = new ArrayList<Integer>();
        
        int m;
        while(n>0){
            m=n%2;
            binary_value.add(m);
            n=n/2;
        }
        
        int num_one = 0;
        int max_consecutive = 0;
        for (int i = 0; i < binary_value.size(); i++) {
            if (binary_value.get(i) == 1) {
                num_one++;
                if (num_one > max_consecutive) {
                    max_consecutive = num_one;
                }
            } else {
                num_one = 0; // Reset the count of consecutive 1's
            }
        }
        System.out.println(max_consecutive);
        
    }
}
