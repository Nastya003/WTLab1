package com.bsuir.lab1.task8;

import java.util.Scanner;

public class Sequences {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements for the 1st seq N:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] inputArray = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter element" + i);
            inputArray[i] = sc.nextDouble();
        }

        System.out.println("Enter the number of elements for the 2nd seq M:");
        int M = sc.nextInt();
        double[] inputArray2 = new double[M];
        for (int i = 0; i < M; i++) {
            System.out.println("Enter element" + i);
            inputArray2[i] = sc.nextDouble();
        }
        createSequence(inputArray, inputArray2);
    }

    private static void createSequence(double[] a, double[] b) {
        int i = 0;
        for (double el : b) {
            while (i < a.length) {
                if (el <= a[i]) {
                    break;
                }
                System.out.print(a[i] + " ");
                i++;
            }
            System.out.print("( " + el + " ) ");
        }

        while (i < a.length) {
            System.out.print( a[i] + " ");
            i++;
        }
    }
}
