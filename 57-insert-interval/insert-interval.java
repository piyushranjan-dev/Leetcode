
import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
System.out.println(Arrays.deepToString(result.toArray()));
        while (i < n && intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);

            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);

            i++;
        }
System.out.println(Arrays.toString(newInterval));
        result.add(newInterval);
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }
int[][] arr1=new int[result.size()][];
        for(int i1=0;i1<result.size();i1++) {
            arr1[i1] = new int[result.get(i1).length];
            for(int j=0;j<result.get(i1).length;j++){
                arr1[i1][j]=result.get(i1)[j];
            }
        }
        return arr1;
    }
}