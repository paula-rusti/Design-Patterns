package org.example.decorator.example;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream( "C:\\Users\\user\\IdeaProjects\\design-patterns\\src\\main\\java\\org\\example\\decorator\\example\\Example.java")
                )
        );
    }
}
