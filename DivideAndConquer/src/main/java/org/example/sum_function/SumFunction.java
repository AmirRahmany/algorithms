package org.example.sum_function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumFunction {

    public int sum(int[] array) {
        if (Arrays.equals(array, new int[]{})) return 0;

        return array[0] + sum(Arrays.copyOfRange(array, 1, array.length));
    }
}
