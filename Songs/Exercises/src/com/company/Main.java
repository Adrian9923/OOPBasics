package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Song> songs = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split("_");
            String typeList = cmdParts[0];
            String name = cmdParts[1];
            String time = cmdParts[2];

            Song song = new Song(typeList, name, time);
            songs.add(song);
        }

        String checkType = scanner.nextLine();
        for (Song song : songs) {
            if (checkType.equals(song.getTypeList())){
                System.out.println(song);
            }
            else if (checkType.equals("all")) {
                System.out.println(song);
            }
        }


    }
}
