package com.aim.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import com.aim.arrays.ArrayUtils;

import org.junit.Test;

public class TestAssert {

    @Test
    public void testAssert() {

        int[] testArray = { 12, 24, 2 };
        int[] expectedArray = { 2, 12, 24 };

        ArrayUtils arrayUtils = new ArrayUtils();
        int[] sortedArray = arrayUtils.sortArray(testArray);

        assertArrayEquals(expectedArray, sortedArray);

    }

}