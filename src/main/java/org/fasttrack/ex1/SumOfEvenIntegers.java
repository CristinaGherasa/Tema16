package org.fasttrack.ex1;

public class SumOfEvenIntegers {
    public static int sumOfEven(int n) {
        if(n == 1) {
            return 2;
        } else {
            return 2 * n + sumOfEven(n - 1);
        }
    }
}
