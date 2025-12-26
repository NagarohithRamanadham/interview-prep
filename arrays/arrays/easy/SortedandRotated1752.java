package arrays.easy;

public class SortedandRotated1752 {
    public boolean check(int[] arr) {
        int k = 0;
        for(int i = 1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) {
                k=i;
                break;
            }
        }

        int[] temp = new int[k];
        for(int i=0;i<k;i++) {
            temp[i] = arr[i];
        }

        for(int tc = 0, i = 0;i<arr.length;i++) {
            if(k<arr.length) {
                arr[i] = arr[k];
                k++;
            }
            else {
                arr[i] = temp[tc];
                tc++;
            }
        }

        for(int i = 1;i<arr.length;i++) {
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
