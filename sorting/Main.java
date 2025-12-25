import advancedSorting.MergeSort;
import basicSorting.BubbleSort;
import basicSorting.InsertionSort;
import basicSorting.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        InsertionSort is = new InsertionSort();
        System.out.println("Insertion Sort: " + Arrays.toString(is.insertionSort(arr)));

        BubbleSort bs = new BubbleSort();
        System.out.println("Bubble Sort: " + Arrays.toString(bs.bubbleSort(arr)));

        SelectionSort ss = new SelectionSort();
        System.out.println("Selection Sort: " + Arrays.toString(ss.selectionSort(arr)));

        MergeSort ms = new MergeSort();
        System.out.println("Merge Sort: " + Arrays.toString(ms.mergeSort(arr)));
    }
}