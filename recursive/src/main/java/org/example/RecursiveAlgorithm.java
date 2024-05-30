package org.example;

public class RecursiveAlgorithm {

    public int factorialOf(int number) {
        if (number == 1) return 1;
        else
            return number * factorialOf(number - 1);
    }
}
