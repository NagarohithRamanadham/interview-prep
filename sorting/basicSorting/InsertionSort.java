package basicSorting;

public class InsertionSort {
    public int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length-1; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(minIndex, i, arr);
        }
        return arr;
    }

    public void swap(int a, int b, int[] arr) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
