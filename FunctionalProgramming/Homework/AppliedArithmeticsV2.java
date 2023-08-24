package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmeticsV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Function<List<Integer>, List<Integer>> add = x -> {
            List<Integer> result = new ArrayList<>();
            for (int y : x) {
                result.add(y + 1);
            }
            return result;
        };
        Function<List<Integer>, List<Integer>> multiply = x -> {
            List<Integer> result = new ArrayList<>();
            for (int y : x) {
                result.add(y * 2);
            }
            return result;
        };

        Function<List<Integer>, List<Integer>> subtract = x -> {
            List<Integer> result = new ArrayList<>();
            for (int y : x) {
                result.add(y - 1);
            }
            return result;
        };

        Function<List<Integer>, String> print = x -> {
            List<String> strList = new ArrayList<>();
            for (int y : x) {
                strList.add(String.valueOf(y));
            }
            return String.join(" ", strList);
        };

        List<Integer> array = Arrays.stream(bfr.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = bfr.readLine();
        while (!command.equals("end")) {

            switch (command) {
                case "add":
                    array = add.apply(array);
                    break;
                case "multiply":
                    array = multiply.apply(array);
                    break;
                case "subtract":
                    array =subtract.apply(array);
                    break;
                case "print":
                    System.out.println(print.apply(array));
                    break;
            }

            command = bfr.readLine();
        }
    }
}
