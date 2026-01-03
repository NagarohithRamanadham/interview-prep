package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class ReversePairs493 {
    public int reversePairs(int[] nums) {
        int count = 0;
        List<Integer> list = new ArrayList<>();

        for(int i: nums) {
            for(int j: list) {
                long val = 2*(long)i;
                if(j>val) count++;
            }
            list.add(i);
        }
        return count;
    }

    public int reversePairsOptimal(int[] arr) {
        int count = 0;
        
        count = divide(arr, 0, arr.length-1);

        return count;
    }

    public int divide(int[] arr, int low, int high) {
        int count = 0;
        if(high<=low) {
            return count;
        }
        int mid = (low+high)/2;
        count += divide(arr, low, mid);
        count += divide(arr, mid+1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    public int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int[] temp = new int[high-low+1];

        int left = low;
        int right = mid+1;
        int tempCount = 0;
        while(left<=mid && right<=high) {
            if(arr[left] < arr[right]) {
                temp[tempCount] = arr[left];
                left++;
            }
            else {
                temp[tempCount] = arr[right];
                right++;
            }
            tempCount++;
        }

        int left1 = low;
        int right1 = mid+1;
        int c = 0;
        while(left1<=mid) {
            if(right1<=high && (long)arr[left1] > 2*(long)arr[right1]) {
                c++;
                right1++;
            }
            else {
                count += c;
                left1++;
            }
        }

        while(left<=mid) {
            temp[tempCount] = arr[left];
            left++;
            tempCount++;
        }

        while(right<=high) {
            temp[tempCount] = arr[right];
            right++;
            tempCount++;
        }

        for(int i=low;i<=high;i++) {
            arr[i] = temp[i-low];
        }

        return count;
    }
}
