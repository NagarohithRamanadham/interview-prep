package basicSorting;

import util.Operations;

//Bubbling out the largest element
//Worst and average - O(n^2) , best case - O(n)

public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    swapped = true;
                    Operations.swap(j, j+1, arr);
                }
            }
            if(!swapped) {
                break;
            }
        }
        return arr;
    }
}
