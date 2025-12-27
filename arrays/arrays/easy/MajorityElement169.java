package arrays.easy;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int count = 1;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j] == nums[i]) {
                    count++;
                }
                if(count>nums.length/2) return nums[i];
            }
            if(count>nums.length/2) return nums[i];
        }
        return 0;
    }

    public int majorityElementOptimal(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums) {
            if(map.getOrDefault(i,0)+1>nums.length/2) return i;
            else map.put(i, map.getOrDefault(i,0)+1);
        }
        return 0;
    }
}
