package leetcode.TwoSum;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    void testAll() {
        assertAll(
            () -> test(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
            () -> test(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
            () -> test(new int[]{3, 3}, 6, new int[]{0, 1}),
            () -> testOptimizeVersion(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
            () -> testOptimizeVersion(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
            () -> testOptimizeVersion(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }

    private void test(int[] input, int num, int[] expected) {

        TwoSum solution = new TwoSum();
        int[] actual = solution.twoSum(input, num);

        // then
        assertArrayEquals(expected, actual);
    }

    public void testOptimizeVersion(int[] input, int num, int[] expected) {
        TwoSum solution = new TwoSum();
        int[] actual = solution.twoSumOptimize(input, num);

        // then
        assertArrayEquals(expected, actual);
    }
}