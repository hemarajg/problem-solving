class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int length = intervals.length, index = 0;
        int[][] result = new int[length+1][];

        for(int i=0;i<length;i++) {
            if(intervals[i][1] < newInterval[0]) {
                result[index++] = intervals[i];
            }
            else if(intervals[i][0] > newInterval[1]) {
                result[index++] = newInterval;
                newInterval = intervals[i];
            }
            else {
                newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
                newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            }
        }
        result[index++] = newInterval;


        return Arrays.copyOf(result, index);
    }
}