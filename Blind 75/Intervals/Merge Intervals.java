class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][];
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        
        stack.push(intervals[0]);
        
        for (int i = 1; i < intervals.length; i++) {
            int[] top = stack.peek();
            
            if (top[1] >= intervals[i][0]) {
                top[1] = Math.max(top[1], intervals[i][1]);
            } else {
                stack.push(intervals[i]);
            }
        }
        
        return stack.toArray(new int[stack.size()][]);
    }
}
