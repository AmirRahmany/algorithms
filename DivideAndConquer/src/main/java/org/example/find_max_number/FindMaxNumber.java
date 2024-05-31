package org.example.find_max_number;

import java.util.Arrays;

public class FindMaxNumber {
    public int findMaxIn(int[] list) {
        if (list.length == 2) {
            return list[0] > list[1] ? list[0] : list[1];
        }
        int subMax = findMaxIn(Arrays.copyOfRange(list, 1, list.length));

        return list[0] > subMax ? list[0] : subMax;
    }
}
