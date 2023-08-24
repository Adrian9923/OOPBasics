package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class customMinFunctionV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Integer[] array = Arrays.stream(bfr.readLine().split("\\s+"))
                .map(Integer::valueOf)
                .toArray(Integer[]::new);

        Function<Integer[], Integer> findMin = (arr) -> {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            return min;
        };

        int min = findMin.apply(array);
        System.out.println(min);
    }
}
