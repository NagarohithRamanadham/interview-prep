package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals56 {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> { 
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        for(int i=0;i<intervals.length;i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            
            if(!list.isEmpty()) {
                List<Integer> last = list.get(list.size()-1);
                if(start<=last.get(1)) {
                    last.set(1, Math.max(last.get(1), end));
                }
                else {
                    list.add(Arrays.asList(start, end));
                }
            }
            else {
                list.add(Arrays.asList(start, end));
            }
        }

        int[][] ans = new int[list.size()][];
        for(int j=0;j<list.size();j++) {
            int[] arr = new int[2];
            for(int i=0;i<list.get(j).size();i++) {
                arr[i] = list.get(j).get(i);
            }
            ans[j] = arr;
        }
        return ans;
    }
}
