package com.company;


public class Main {
    public static void main(String[] args) {

        Jar<String> stringsJar = new Jar<>();
        stringsJar.add("Hello");
        stringsJar.add("SoftUni");
        System.out.println(stringsJar.remove());


    }

}


