package advancedSorting;

public class MergeSort {
    public int[] mergeSort(int[] arr) {
        divide(arr, 0, arr.length-1);
        return arr;
    }

    public void divide(int[] arr, int low, int high) {
        if(high<=low) {
            return;
        }
        int mid = (low+high)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
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
    }
}
