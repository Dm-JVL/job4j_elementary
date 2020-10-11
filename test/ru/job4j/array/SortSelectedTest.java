package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort34125() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort321() {
        int[] input = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortMin130456() {
        int[] input = new int[] {-1, 0, -30, 45, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {-30, -1, 0, 6, 45};
        assertThat(result, is(expect));
    }
}