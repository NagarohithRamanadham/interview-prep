package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> ansUnq = new HashSet<>();

        for(int i=0;i<nums.length;i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++) {
                int compliment = -(nums[i]+nums[j]);
                if(set.contains(compliment)) {
                    List<Integer> subAns = new ArrayList<>();
                    subAns.add(nums[i]);
                    subAns.add(nums[j]);
                    subAns.add(compliment);
                    Collections.sort(subAns);
                    ansUnq.add(subAns);
                }
                set.add(nums[j]);
            }
        }
        for(List<Integer> l: ansUnq) {
            ans.add(l);
        }
        return ans;
    }

    public List<List<Integer>> threeSumOptimal(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int i = 0;
        while(i<nums.length-1) {
            int j=i+1;
            int k = nums.length-1;
            while(j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0) {
                    List<Integer> subAns = new ArrayList<>();
                    subAns.add(nums[i]);
                    subAns.add(nums[j]);
                    subAns.add(nums[k]);
                    ans.add(subAns);
                    int elementJ = nums[j];
                    while(j<nums.length && nums[j]==elementJ) {
                        j++;
                    }
                    int elementK = nums[k];
                    while(k>=0 && nums[k]==elementK) {
                        k--;
                    }
                }
                else if(sum<0) {
                    j++;
                }
                else {
                    k--;
                }
            }
            int elementI = nums[i];
            while(i<nums.length && nums[i]==elementI) {
                i++;
            }
        }
        return ans;
    }
}
