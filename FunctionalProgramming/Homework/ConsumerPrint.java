package FunctionalProgramming.Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Consumer<String> print = person -> System.out.printf("%s\n",person);
        String[] array = bfr.readLine().split("\\s+");
        for (String s : array) {
           print.accept(s);
        }

    }
}
