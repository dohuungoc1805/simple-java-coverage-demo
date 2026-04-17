package com.example;

public class Calculator {

    public int sumEvenNumbers(int n) {
        if (n <= 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum even numbers up to 10: " + calc.sumEvenNumbers(10));
    }
}