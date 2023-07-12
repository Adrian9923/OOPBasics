package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();

        String command = scanner.nextLine();
        String[] cmdParts = command.split(", ");
        String title = cmdParts[0];
        String content = cmdParts[1];
        String author = cmdParts[2];

        Article article = new Article(title, content, author);
        articles.add(article);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(": ");
            String action = tokens[0];
            String request = tokens[1];
            switch (action) {
                case "Edit": {
                    article.edit(request);
                    break;
                }
                case "ChangeAuthor": {
                    article.changeAuthor(request);
                    break;
                }
                case "Rename": {
                    article.rename(request);
                    break;
                }
            }
        }

        for (Article item : articles) {
            System.out.println(item);
        }

    }
}
