package leetcode.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        if (nums.length == 2) {
            return new int[]{0, 1};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Objects.equals(nums[i] + nums[j], target)){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSumOptimize(int[] nums, int target) {

        if (nums.length == 2) {
            return new int[]{0, 1};
        }

        Map<Integer, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(resultMap.containsKey(target - nums[i])){
                int[] result = new int[]{i, resultMap.get(target-nums[i])};
                Arrays.sort(result); // 테스트 통과를 위한 정렬
                return result;
            }
            resultMap.put(nums[i], i);
        }

        return null;
    }
}
