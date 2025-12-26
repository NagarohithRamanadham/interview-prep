package arrays.easy;

import sorting.util.Operations;

public class MoveZeros283 {
    public void moveZeroes(int[] arr) {
        int j = -1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) {
                j=i;
                break;
            }
        }
        if(j==-1) return;

        for(int i=j+1;i<arr.length;i++) {
            if(arr[i]!=0) {
                Operations.swap(i,j,arr);
                j++;
            }
        }
    }

    public void moveZeroesNotJumble(int[] arr) {
        int len = 0;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]!=0) {
                len++;
            }
        }

        if(len==0) return;

        int[] temp = new int[len];
        for(int c=0 , i = 0;i<arr.length;i++) {
            if(arr[i]!=0) {
                temp[c] = arr[i];
                c++;
            }
        }

        for(int i = 0;i<arr.length;i++) {
            if(i<temp.length) arr[i] = temp[i];
            else arr[i] = 0;
        }
    }
}
