package org.fasttrack.ex1;

import static org.fasttrack.ex1.RecursiveFibonacci.fibonacci;
import static org.fasttrack.ex1.SumOfDigits.sumOfDigits;
import static org.fasttrack.ex1.SumOfEvenIntegers.sumOfEven;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sum of first 1 even integer: " + sumOfEven(1));
        System.out.println("Sum of first 2 even integers: " + sumOfEven(2));
        System.out.println("Sum of first 5 even integers: " + sumOfEven(5));


        System.out.println("Sum of digits of 123: " + sumOfDigits(123));
        System.out.println("Sum of digits of 456789: " + sumOfDigits(456789));
        System.out.println("Sum of digits of 9876: " + sumOfDigits(9876));


        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));

        n = 5;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));

        n = 7;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}