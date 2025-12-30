package arrays;

import arrays.easy.MoveZeros283;
import arrays.easy.RemoveDuplicates;
import arrays.easy.SecondLargest;
import arrays.easy.TwoSum1;
import arrays.medium.NextPerm31;
import arrays.medium.RearrangeArray2149;
import arrays.medium.RotateArray189;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        NextPerm31 n = new NextPerm31();
        System.out.println(Arrays.toString(n.nextPermutation(arr)));

    }
}
