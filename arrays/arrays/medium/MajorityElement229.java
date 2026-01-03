package arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();
        int minLen = nums.length/3;
        
        for(int i: nums) {
            int count = map.getOrDefault(i, 0)+1;
            if(count>minLen && !ans.contains(i)) {
                ans.add(i);
            }
            map.put(i, count);
        }

        return ans;
    }

    public List<Integer> majorityElementOptimal(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int c1 = 0, c2 = 0;
        int e1 = Integer.MIN_VALUE, e2 = Integer.MIN_VALUE;
        int minLen = nums.length/3;

        for(int i: nums) {
            if(c1==0 && e2!=i) {
                e1 = i;
                c1++;
            }
            else if(c2==0 && e1!=i) {
                e2 = i;
                c2++;
            }
            else if(e1==i) {
                c1++;
            }
            else if(e2==i) {
                c2++;
            }
            else {
                c1--;
                c2--;
            }
        }
        c1 = 0; 
        c2 = 0;

        for(int i: nums) {
            if(i==e1) c1++;
            else if(i==e2) c2++;
        }

        if(c1>minLen) ans.add(e1);
        if(c2>minLen) ans.add(e2);
        return ans;
    }
}
