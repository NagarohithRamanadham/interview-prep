package arrays;

import arrays.easy.MoveZeros283;
import arrays.easy.RemoveDuplicates;
import arrays.easy.SecondLargest;
import arrays.easy.TwoSum1;
import arrays.medium.NextPerm31;
import arrays.medium.RearrangeArray2149;
import arrays.medium.RotateArray189;
import arrays.medium.Spiral54;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        // NextPerm31 n = new NextPerm31();
        // System.out.println(Arrays.toString(n.nextPermutation(arr)));

        Spiral54 s = new Spiral54();
        System.out.println(s.spiralOrder(arr));
        
        //test-pr
    }
}
