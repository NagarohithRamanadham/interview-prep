package arrays.medium;

import sorting.util.Operations;

public class RearrangeArray2149 {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 1;

        int[] ans = new int[nums.length];
        for(int i: nums) {
            if(i>0) {
                ans[pos] = i;
                pos +=2;
            }
            else {
                ans[neg] = i;
                neg +=2;
            }
        }
        return ans;
    }
}
