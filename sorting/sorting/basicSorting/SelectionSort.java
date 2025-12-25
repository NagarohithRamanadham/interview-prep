/*
Selects each element and sets the element at it's correct position, checks with the previous elements until it's correct position is found.
Average and worst case - O(n^2), Best case - O(n)
*/
package sorting.basicSorting;

import sorting.util.Operations;

public class SelectionSort {
    public int[] selectionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j>0 && arr[j]<arr[j-1]) {
                Operations.swap(j, j-1, arr);
                j--;
            }
        }
        return arr;
    }
}
