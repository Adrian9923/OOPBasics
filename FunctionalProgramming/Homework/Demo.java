package FunctionalProgramming.Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        int[] arraay = new int[line.length];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            arraay[i] = Integer.parseInt(line[i]);
        }

        for (int i : arraay) {
            if ((i & 1) == 1){
                list.add(i);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
