package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Function<List<Integer>, Integer> findSmallest = (arr) -> {
            int x = arr.get(0);
            int index = 0;
            for (int i = 1; i < arr.size(); i++) {
                if (arr.get(i) < x) {
                    x = arr.get(i);
                    index = i;
                }
            }
            return index;
        };

        List<Integer> list = Arrays.stream(bfr.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(findSmallest.apply(list));
    }
}
