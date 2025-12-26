package arrays;

import arrays.easy.MoveZeros283;
import arrays.easy.RemoveDuplicates;
import arrays.easy.SecondLargest;
import arrays.medium.RotateArray189;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        MoveZeros283 mz = new MoveZeros283();
        mz.moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }
}
