package org.dev.bublesort;

import org.jetbrains.annotations.NotNull;

public class BubbleSort {

    public int[] sortAscending(int @NotNull [] array) {
        boolean swaapp;
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            swaapp = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaapp = true;
                }
            }
            if (!swaapp) break;
        }
        return array;
    }
}
