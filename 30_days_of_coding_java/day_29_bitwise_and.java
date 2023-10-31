import java.io.*;
import java.util.*;
import java.util.stream.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
    // Write your code here
        List<Integer> arr = new ArrayList<>();
        int max = 0;
        
        for (int i = 0; i < N; i++) {
            arr.add(i + 1);
        }

        int temp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                temp = arr.get(i) & arr.get(j);

                if (temp < K && temp > max) {
                    max = temp;
                }
            }
        }

        return max;

    }

}

public class day_29_bitwise_and {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int count = Integer.parseInt(firstMultipleInput[0]);

                int lim = Integer.parseInt(firstMultipleInput[1]);

                int res = Result1.bitwiseAnd(count, lim);

                bufferedWriter.write(String.valueOf(res));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
