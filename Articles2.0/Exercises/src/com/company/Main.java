package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            String[] cmdParts = command.split(", ");
            String title = cmdParts[0];
            String content = cmdParts[1];
            String author = cmdParts[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String check = scanner.nextLine();
        switch (check) {
            case "title": {
                articles.sort((n1,n2) -> n1.getTitle().compareTo(n2.getTitle()));
                break;
            }
            case "content": {
                articles.sort((n1, n2) -> n1.getContent().compareTo(n2.getContent()));
                break;
            }
            case "author": {
                articles.sort((n1, n2) -> n1.getAuthor().compareTo(n2.getAuthor()));
                break;
            }
        }
        for (Article article : articles) {
            System.out.println(article);
        }

    }
}
