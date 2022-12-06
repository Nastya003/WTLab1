package com.bsuir.lab1.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayAnalyzer {
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Enter " + i);
            Array[i] = sc.nextInt();
        }
        System.out.println("indexes : " + SimpleNumbers(Array, N));
    }

    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> SimpleNumbers(int[] Array, int N) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            if (isPrime(Array[i])) {
                result.add(i);
            }
        }
        return result;
    }
}
