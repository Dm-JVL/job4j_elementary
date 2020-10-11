package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] data) {
        int min, index;
        for (int ind = 0; ind < data.length; ind++) {
            min = MinDiapason.findMin(data, ind, data.length - 1);
            index = FindLoop.indexOf(data, min, ind, data.length - 1);
            data = SwitchArray.swap(data, ind, index);
        }
        return data;
    }
}