package FunctionalProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        double[] array = Arrays.stream(bfr.readLine().split("[,\\s]+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        Function<Double, Double> priceWithVAT = number -> number * 1.2;
        System.out.println("Prices with VAT:");
        for (double v : array) {
            System.out.printf("%.2f\n", priceWithVAT.apply(v));
        }

    }
}
