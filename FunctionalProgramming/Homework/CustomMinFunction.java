package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int[] array = Arrays.stream(bfr.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Function<int[], Integer> findMin = (arr) -> {
            int min = arr[0];
            for (int i = 1; i <= arr.length - 1; i++) {
                if (arr[i] < min) {
                    min = i;
                }
            }
            return min;
        };

        int min = findMin.apply(array);
        System.out.println(min);
    }
}
