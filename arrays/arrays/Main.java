package arrays;

import arrays.easy.RemoveDuplicates;
import arrays.easy.SecondLargest;

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

        SecondLargest sl = new SecondLargest();
        System.out.println("Second Largest number is: " + sl.secondLargest(arr));

        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println("After removing duplicates: " + Arrays.toString(rd.removeDuplicates(arr)));

    }
}
