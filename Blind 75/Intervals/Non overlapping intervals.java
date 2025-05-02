import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort intervals by their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        
        int count = 0;
        int[] curr = intervals[0];
        
        for (int i = 1; i < intervals.length; i++) {
            // Check for overlap
            if (curr[1] > intervals[i][0]) {
                count++; // Remove overlapping interval
            } else {
                curr = intervals[i]; // Update current interval
            }
        }
        
        return count;
    }
}


Sorting intervals by end time because it maximizes the number of non-overlapping intervals and minimize the number of intervals to remove