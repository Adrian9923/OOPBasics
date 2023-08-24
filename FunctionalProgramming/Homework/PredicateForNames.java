package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bfr.readLine());
        String[] names = Arrays.stream(bfr.readLine().split("\\s+"))
                .toArray(String[]::new);

        Predicate<String> isLessOrEqual = x -> x.length() <= n;
        for (String name : names) {
            if (isLessOrEqual.test(name)){
                System.out.println(name);
            }
        }

    }
}
