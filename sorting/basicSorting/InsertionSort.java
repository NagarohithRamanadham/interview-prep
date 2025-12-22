/*
Taking the ith index as mini and comparing it with all the next elements until we find the minimum number
Best, average and worst case - O(n^2)
*/
package basicSorting;

import util.Operations;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            Operations.swap(minIndex, i, arr);
        }
        return arr;
    }
}
