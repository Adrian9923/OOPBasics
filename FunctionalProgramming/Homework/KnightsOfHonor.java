package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Consumer<String> print = person -> System.out.printf("Sir %s\n",person);

        String[] array = Arrays.stream(bfr.readLine().split("\\s+"))
                .toArray(String[]::new);

        for (String s : array) {
            print.accept(s);
        }

    }
}
