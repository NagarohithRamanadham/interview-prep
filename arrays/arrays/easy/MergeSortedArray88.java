package arrays.easy;

public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;

        int[] ans = new int[nums1.length];
        int p = 0;
        while(i<m && j<n) {
            if(nums1[i]<nums2[j]) {
                ans[p] = nums1[i];
                p++;
                i++;
            }
            else {
                ans[p] = nums2[j];
                p++;
                j++;
            }
        }

        while(i<m) {
            ans[p] = nums1[i];
            i++;
            p++;
        }

        while(j<n) {
            ans[p] = nums2[j];
            j++;
            p++;
        }

        System.arraycopy(ans, 0, nums1, 0, ans.length);
    }
}
