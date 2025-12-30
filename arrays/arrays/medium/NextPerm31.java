package arrays.medium;

import java.util.ArrayList;
import java.util.Collections;

public class NextPerm31 {
    public int[] nextPermutation(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        int[] ans = new int[n];

        for(int i=n-1;i>=0;i--) {
            int element = nums[i];
            int minGreater = Integer.MAX_VALUE;

            for(int j: list) {
                if(j>element) {
                    minGreater = Math.min(minGreater, j);
                }
            }

            list.add(nums[i]);

            if(i==0 || minGreater!=Integer.MAX_VALUE) {
                int k = 0;
                while(k<i) {
                    ans[k] = nums[k];
                    k++;
                }
                if(k<n && minGreater!=Integer.MAX_VALUE) {
                    ans[k] = minGreater;
                    list.remove(Integer.valueOf(minGreater));
                    k++;
                }
                Collections.sort(list);
                while(k<n) {
                    ans[k] = list.remove(0);
                    k++;
                }
                break;
            }
        }
//        System.arraycopy(ans, 0, nums, 0, n);
        return ans;
    }
}
