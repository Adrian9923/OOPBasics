package FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        Predicate<String> isUppercase = word -> word.toUpperCase().charAt(0) == word.charAt(0);

        String[] tokens = bfr.readLine().split("\\s+");
        for (int i = 0; i < tokens.length; i++) {
            if (isUppercase.test(tokens[i])){
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < tokens.length; i++) {
            if (isUppercase.test(tokens[i])) {
                System.out.println(tokens[i]);
            }
        }

    }
}
