package advancedSorting;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] arr) {
        return divide(arr);
    }

    public int[] divide(int[] arr) {
        if(arr.length<=1) {
            return arr;
        }
        int[] left = Arrays.copyOfRange(arr, 0, arr.length/2);
        int[] right = Arrays.copyOfRange(arr, arr.length/2, arr.length);
        return merge(divide(left), divide(right));
    }

    public int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length+right.length];
        int arrCounter = 0;
        int leftCounter = 0;
        int rightCounter = 0;

        while(leftCounter<left.length && rightCounter < right.length) {
            if(left[leftCounter] < right[rightCounter]) {
                arr[arrCounter] = left[leftCounter];
                leftCounter++;
            }
            else {
                arr[arrCounter] = right[rightCounter];
                rightCounter++;
            }
            arrCounter++;
        }

        while(leftCounter<left.length) {
            arr[arrCounter] = left[leftCounter];
            leftCounter++;
            arrCounter++;
        }

        while(rightCounter<right.length) {
            arr[arrCounter] = right[rightCounter];
            rightCounter++;
            arrCounter++;
        }

        return arr;
    }
}
