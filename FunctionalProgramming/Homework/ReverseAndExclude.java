package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> list = Arrays.stream(bfr.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(bfr.readLine());
        Predicate<Integer> isDivisible = number -> number % n != 0;
        list.stream().filter(isDivisible)
                .sorted((a,b) -> Integer.compare(b,a))
                .forEach(number -> {
            System.out.print(number + " ");
        });
    }
}
