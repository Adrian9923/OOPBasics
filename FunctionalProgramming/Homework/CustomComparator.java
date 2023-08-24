package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Function<List<Integer>, String> compare = (array) -> {
            List<Integer> evenList = new ArrayList<>();
            List<String> sortedList = new ArrayList<>();
            List<Integer> oddList = new ArrayList<>();
            for (Integer integer : array) {
                if (integer % 2 == 0){
                    evenList.add(integer);
                }
            }
            for (Integer integer : evenList) {
                sortedList.add(String.valueOf(integer));
            }

            for (Integer integer : array) {
                if ((integer & 1) == 1) {
                    oddList.add(integer);
                }
            }
            for (Integer integer : oddList) {
                sortedList.add(String.valueOf(integer));
            }

            return String.join(" ", sortedList);
        };

        List<Integer> list = Arrays.stream(bfr.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(compare.apply(list));
    }
}
