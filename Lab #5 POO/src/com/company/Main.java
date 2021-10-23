package com.company;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    public static String f_open(String f_path) {
        try {
            return Files.readString(Paths.get(f_path));
        } catch (IOException exc) {
            System.out.println("ERROR PATH: " + f_path);
            return "ERROR PATH";
        }
    }

    public static void main(String[] args) throws Exception {
        MathExpression.print_expressions(f_open("C:\\Users\\User\\Desktop\\Lab #5 POO\\src\\com\\company\\_one_expression.txt"));
        MathExpression.print_expressions(f_open("C:\\Users\\User\\Desktop\\Lab #5 POO\\src\\com\\company\\_three_expressions.txt"));
    }
}
