package com.aim.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayUtilsTest {

    @Test
    public void sortArray_UnsortedArray_ShouldSortArrayAscending() {

        int[] testedArray = { 12, 1020, 35, 24, 2, 55 };
        int[] expectedArray = { 2, 12, 24, 35, 55, 1020 };

        ArrayUtils arrayUtils = new ArrayUtils();
        int[] sortedArray = arrayUtils.sortArray(testedArray);

        assertArrayEquals(expectedArray, sortedArray);

    }

}