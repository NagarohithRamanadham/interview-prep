/*
TC: O(n)
 */
package arrays.easy;

public class SecondLargest {

    public int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = 0;

        for(int i: arr) {
            if(i>largest) {
                secondLargest = largest;
                largest = i;
            }
            else if(i<largest && i>secondLargest){
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
