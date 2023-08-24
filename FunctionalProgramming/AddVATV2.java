package FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class AddVATV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        Function<Double, Double> priceWithVAT = number -> number * 1.2;
        System.out.println("Prices with VAT:");

        Arrays.stream(bfr.readLine().split(", "))
                .map(Double::parseDouble)
                .map(priceWithVAT)
                .forEach(number -> System.out.printf("%.2f\n",number));
    }
}
