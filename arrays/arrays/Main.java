package arrays;

import arrays.easy.MoveZeros283;
import arrays.easy.RemoveDuplicates;
import arrays.easy.SecondLargest;
import arrays.easy.SetMismatch645;
import arrays.easy.TwoSum1;
import arrays.medium.NextPerm31;
import arrays.medium.RearrangeArray2149;
import arrays.medium.RotateArray189;
import arrays.medium.Spiral54;
import arrays.medium.SubArray560;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,3,2};

        // NextPerm31 n = new NextPerm31();
        // System.out.println(Arrays.toString(n.nextPermutation(arr)));

        // Spiral54 s = new Spiral54();
        // System.out.println(s.spiralOrder(arr));

        // SubArray560 sa = new SubArray560();
        // System.out.println(sa.subarraySum2(arr, 1));

        SetMismatch645 s = new SetMismatch645();
        System.out.println(Arrays.toString(s.findErrorNums(arr)));
        
        //test-pr
    }
}
