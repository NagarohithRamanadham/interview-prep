package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length) {
            int j=i+1;
            while(j<nums.length) {
                int k = j+1;
                int l = nums.length-1;

                while(k<l) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];
                    if(sum==target) {
                        List<Integer> subAns = new ArrayList<>();
                        subAns.add(nums[i]);
                        subAns.add(nums[j]);
                        subAns.add(nums[k]);
                        subAns.add(nums[l]);
                        ans.add(subAns);
                        k++;
                        l--;
                        while(k<nums.length && nums[k]==nums[k-1]) {
                            k++;
                        }
                        while(l>=0 && nums[l]==nums[l+1]) {
                            l--;
                        }
                    }
                    else if(sum>target) {
                        l--;
                        while(l>=0 && nums[l]==nums[l+1]) {
                            l--;
                        }
                    }
                    else {
                        k++;
                        while(k<nums.length && nums[k]==nums[k-1]) {
                            k++;
                        }
                    }
                }
                j++;
                while(j<nums.length && nums[j]==nums[j-1]) j++;
            }
            i++;
            while(i<nums.length && nums[i]==nums[i-1]) i++;
        }
        return ans;
    }
}
