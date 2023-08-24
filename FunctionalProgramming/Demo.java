package FunctionalProgramming;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Demo {

    private static int sum(int a, int b) {
        return a + b + new Random().nextInt();
    }

    public static void main(String[] args) {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(sum(5,10));
    }
}
