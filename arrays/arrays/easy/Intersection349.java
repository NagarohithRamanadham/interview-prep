package arrays.easy;

import java.util.Arrays;

public class Intersection349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        int ansPointer = 0;
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length) {
            if(nums1[i]==nums2[j] && (ansPointer==0 || ans[ansPointer-1]!=nums1[i])) {
                ans[ansPointer] = nums1[i];
                i++;
                j++;
                ansPointer++;
            }
            else if(nums1[i]<nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        int[] fa = new int[ansPointer];
        System.arraycopy(ans, 0, fa, 0, ansPointer);

        return fa;
    }
}
