package arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class Pascal118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows==0) return ans;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        ans.add(new ArrayList<>(temp));
        for(int i=1;i<numRows;i++) {
            List<Integer> current = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                List<Integer> prev = ans.get(i-1);
                int left=0, right=0;
                if(j-1 >= 0) left = prev.get(j-1);
                if(j < prev.size()) right = prev.get(j);
                current.add(left+right);
            }
            ans.add(new ArrayList<>(current));
        }
        return ans;
    }

}
