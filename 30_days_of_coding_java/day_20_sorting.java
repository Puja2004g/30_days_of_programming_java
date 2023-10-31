import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import static java.util.stream.Collectors.joining;

public class day_20_sorting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        // Write your code here
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                    if(a.get(j)>a.get(j+1)){
                        int temp = a.get(j);
                        a.set(j, a.get(j + 1));
                        a.set(j + 1, temp);
                        count++;
                    }                
                }
            }
            System.out.println("Array is sorted in "+ count+ " swaps.");
            System.out.println("First Element: "+a.get(0));
            System.out.println("Last Element: "+a.get(n-1));
            bufferedReader.close();
        }

    }

