package arrays;

import arrays.easy.MoveZeros283;
import arrays.easy.RemoveDuplicates;
import arrays.easy.SecondLargest;
import arrays.easy.TwoSum1;
import arrays.medium.RearrangeArray2149;
import arrays.medium.RotateArray189;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26, -37, -10, -9, 15, 14, 31};

        RearrangeArray2149 ra = new RearrangeArray2149();
        System.out.println(Arrays.toString(ra.rearrangeArray(arr)));

    }
}
