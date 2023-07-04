package leetcode.TwoSum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest extends TestCase {

    @Test
    public void test() {
        TwoSum solution = new TwoSum();

        int[] inputNumList1 = new int[]{2, 7, 11, 15};
        int target1 = 9;

        int[] inputNumList2 = new int[]{3, 2, 4};
        int target2 = 6;

        int[] inputNumList3 = new int[]{3, 3};
        int target3 = 6;

        Assert.assertArrayEquals(new int[]{0, 1}, solution.twoSum(inputNumList1, target1));
        Assert.assertArrayEquals(new int[]{1, 2}, solution.twoSum(inputNumList2, target2));
        Assert.assertArrayEquals(new int[]{0, 1}, solution.twoSum(inputNumList3, target3));

        Assert.assertArrayEquals(new int[]{0, 1}, solution.twoSumOptimize(inputNumList1, target1));
        Assert.assertArrayEquals(new int[]{1, 2}, solution.twoSumOptimize(inputNumList2, target2));
        Assert.assertArrayEquals(new int[]{0, 1}, solution.twoSumOptimize(inputNumList3, target3));
    }
}