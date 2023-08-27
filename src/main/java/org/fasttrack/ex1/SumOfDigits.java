package org.fasttrack.ex1;

public class SumOfDigits {
    public static int sumOfDigits(int number) {
        if(number < 10) {
            return number;
        } else {
            return number % 10 + sumOfDigits(number / 10);
        }
    }

}
