package com.bsuir.lab1.task1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();

        System.out.println("Result is " + calculateFormula(x, y));
    }
    private static double calculateFormula(final double x, final double y){
        return (1 + Math.pow(Math.sin(x + y), 2)) /
                (2 + Math.abs(x - ((2 * x) / (1 + x * x * y * y)))) + x;
    }
}
