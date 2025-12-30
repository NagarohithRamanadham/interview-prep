package arrays.medium;

import java.util.HashSet;

public class LongestConsecutive128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums) {
            set.add(i);
        }

        int max = 0;
        for(int i: set) {
            int count = 1;
            if(!set.contains(i-1)) {
                while(set.contains(i+1)) {
                    i++;
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
