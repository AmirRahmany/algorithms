package org.example.count_list_items;

import java.util.Arrays;

public class CountListItem {
    public int count(int[] array) {
        if (Arrays.equals(array, new int[]{})) return 0;

        return 1 + count(Arrays.copyOfRange(array, 1, array.length));
    }
}
