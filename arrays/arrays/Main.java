package arrays;

import arrays.easy.MoveZeros283;
import arrays.easy.RemoveDuplicates;
import arrays.easy.SecondLargest;
import arrays.easy.TwoSum1;
import arrays.medium.RotateArray189;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3,2,4};

        TwoSum1 ts = new TwoSum1();
        System.out.println(Arrays.toString(ts.twoSum(arr, 6)));

    }
}
