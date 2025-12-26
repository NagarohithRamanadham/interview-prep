package arrays.medium;

import sorting.util.Operations;

public class RotateArray189 {
    public void rotate(int[] arr, int k) {
        k=k%arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public void reverse(int[] arr, int start, int end) {
        while(start<end) {
            Operations.swap(start, end, arr);
            start++;
            end--;
        }
    }
}
