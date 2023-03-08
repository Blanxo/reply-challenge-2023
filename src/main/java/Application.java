package main.java;

import java.io.File;

public class Application {
    public static void main(String[] args) {
        System.out.println(Reader.readFileRows("src/resources/00-example.txt"));
    }


}