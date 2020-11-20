package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int k = 0, j = 0;
        for (int i = 0; i < rsl.length; i++) {
            if ((k < left.length) && (left[k] <= right[j])) {
                rsl[i] = left[k];
                k++;
            } else {
                if (j < right.length) {
                    rsl[i] = right[j];
                    j++;
                }
            }
        }
        return rsl;
    }
}

