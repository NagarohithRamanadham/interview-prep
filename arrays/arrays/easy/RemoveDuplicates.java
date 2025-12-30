package arrays.easy;

import sorting.util.Operations;

public class RemoveDuplicates {
    public int[] removeDuplicates(int[] arr) {
        int j = 0;
        for(int i = 1;i<arr.length;i++) {
            if(arr[i]!=arr[j]) {
                j++;
                Operations.swap(j, i, arr);
            }
        }

        return arr;
    }
}
