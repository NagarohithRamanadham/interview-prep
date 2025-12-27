package arrays.medium;

import sorting.util.Operations;

public class SortColors75 {
    public void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;

        for(int i: nums) {
            if(i==0) c0++;
            else if(i==1) c1++;
            else c2++;
        }

        int p = 0;
        while(c0>=0) {
            nums[p] = 0;
            c0--;
            p++;
        }

        while(c1>=0) {
            nums[p] = 1;
            c1--;
            p++;
        }

        while(c2>=0) {
            nums[p] = 2;
            c2--;
            p++;
        }
    }

    public void sortColorsOptimal(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high) {
            if(nums[mid] == 0) {
                Operations.swap(mid, low, nums);

                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
            }
            else {
                Operations.swap(high, mid, nums);

                high--;
            }
        }
    }
}
