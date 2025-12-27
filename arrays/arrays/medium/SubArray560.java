package arrays.medium;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SubArray560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int presSum = 0;
        int len = 0;

        for(int i=0;i<nums.length;i++) {
            presSum += nums[i];

            //Check is the presum is the k
            if(presSum==k) {
                if(len<i+1) {
                    len = i+1;
                }
            }
            //Check in the map if there is any value with (preSum-k)
            else {
                for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
                    if(entry.getValue()==presSum-k && i-entry.getKey()>len) {
                        len = i-entry.getKey();
                    }
                }
            }
            if(!map.containsValue(presSum)) map.put(i,presSum);
        }
        return len;
    }

    public int subarraySumOptimal(int[] nums, int k) {
        int presSum = 0;
        int count = 0;
        int j = 0;

        for(int i=0;i<nums.length;i++) {
            presSum += nums[i];

            //Check is the presum is the k
            if(presSum==k) {
                count++;
            }
            while(presSum<=k) {
                presSum = presSum - nums[j];
                j++;
                if(presSum==k) {
                    count++;
                }
            }
        }
        return count;
    }
}
