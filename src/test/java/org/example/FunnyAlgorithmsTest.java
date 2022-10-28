package org.example;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class FunnyAlgorithmsTest {

    private static FunnyAlgorithms funnyAlgorithms = null;

    @BeforeClass
    public static void setUp() {
        funnyAlgorithms = new FunnyAlgorithms();
    }


    /* BINARY SEARCH */
    @Test
    public void shouldReturnMinusOneIfTargetDoesntExist() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 10;

        int expected = -1;
        int actual = funnyAlgorithms.binarySearch(nums, target);

        assertEquals(expected, actual);
    }


    /* SWAP */
    @Test
    public void shouldSwapTwoElements() {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int i = 0;
        int j = 1;

        int[] expected = { 2, 1, 3, 4, 5, 6, 7, 8, 9 };
        FunnyAlgorithms.swap(array, i, j);

        assertEquals(expected, array);

    }



    /* SELECTION SORT */
    @Test
    public void shouldSortArrayInAscendingOrder() {
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int order = 0;

        int[] expected = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        funnyAlgorithms.selectionSort(array, order);

        assertArrayEquals(expected, array);

    }


    /* STRING TO INT */
    @Test
    public void stringToIntTest() {
        String s = "123";

        int expected = 123;
        int actual = funnyAlgorithms.stringToIntConverter(s);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionIfStringIsNotANumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String s = "abc";
            funnyAlgorithms.stringToIntConverter(s);
        });
    }

    @Test
    public void shouldThrowExceptionIfStringIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String s = null;
            funnyAlgorithms.stringToIntConverter(s);
        });
    }

    @Test
    public void shouldThrowExceptionIfRealNumberIsPassed() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            String s = "123.45";
            funnyAlgorithms.stringToIntConverter(s);
        });
    }

}
