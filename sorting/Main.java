import advancedSorting.MergeSort;
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

//        InsertionSort is = new InsertionSort();
//        System.out.println(Arrays.toString(is.insertionSort(arr)));

//        BubbleSort bs = new BubbleSort();
//        System.out.println(Arrays.toString(bs.bubbleSort(arr)));

//        SelectionSort ss = new SelectionSort();
//        System.out.println(Arrays.toString(ss.selectionSort(arr)));

        MergeSort ms = new MergeSort();
        System.out.println(Arrays.toString(ms.mergeSort(arr)));
    }
}