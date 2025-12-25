/*
Time complexity is O(n log n) same as merge sort
Space complexity is O(1) as we are not using any extra array or lists.
 */

package advancedSorting;

import util.Operations;

public class QuickSort {
    public int[] quickSort(int[] arr) {
        qs(arr, 0, arr.length-1);
        return arr;
    }

    public void qs(int[] arr, int low, int high) {
        if(low>=high) {
            return;
        }
        int pivot = (low + high) / 2;
        int i = low;
        int j = high;
        while(i<j) {
            while(i<=high && arr[i]<=arr[pivot]) {
                i++;
            }
            while(j>=low && arr[j]>arr[pivot]) {
                j--;
            }
            if(i<j) {
                Operations.swap(i, j, arr);
            }
        }
        Operations.swap(j, pivot, arr);
        qs(arr, low, pivot-1);
        qs(arr, pivot+1, high);
    }
}
