package ru.job4j.max;

public class Reduce {
    private int[] array;

    public Reduce(int[] arrayIn) {
        this.array = arrayIn;
    }

    public void to(int[] arrayNew) {
        array = arrayNew;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce(array);
        //reduce.to(array);
        reduce.print();
    }
}