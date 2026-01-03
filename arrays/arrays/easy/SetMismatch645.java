package arrays.easy;

public class SetMismatch645 {
    public int[] findErrorNums(int[] nums) {
        int a=0;
        int b=0;

        int i = 0;
        while(i<nums.length) {
            int element = nums[i];
            //checking if the element at i is at the correct position in the array
            if(nums[element-1]!=element) {
                int temp = nums[i];
                nums[i] = nums[element-1];
                nums[element-1] = temp;
            }
            else {
                i++;
            }
        }

        for(int j=0;j<nums.length;j++) {
            if(nums[j]-1!=j) {
                a=nums[j];
                b=j+1;
            }
        }

        return new int[]{a,b};
    }

}
