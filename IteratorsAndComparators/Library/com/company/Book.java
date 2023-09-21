package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title, int year, String... authors) {
        this.setAuthors(authors);
        this.setTitle(title);
        this.setYear(year);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(String... authors) {
        this.authors = new ArrayList<>(Arrays.asList(authors));
    }

    @Override
    public String toString() {
        if (this.authors.size() == 0){
            return String.format("Title: %s, Year: %d",this.title,this.year);
        }
        return String.format("Title: %s, Year: %d, Authors: %s",this.title,this.year,String.join(", ",this.authors));
    }
}