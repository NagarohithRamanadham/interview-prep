package arrays.easy;

import java.util.Arrays;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        Arrays.sort(nums);
        while (start < end) {
            if (nums[start] + nums[end] == target) {
                return new int[]{start, end};
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else end--;
        }
        return new int[]{0, 0};
    }
}
