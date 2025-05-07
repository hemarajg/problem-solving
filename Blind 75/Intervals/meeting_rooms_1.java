/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int length = intervals.size();
        if(length == 0) return true;
        intervals.sort(Comparator.comparingInt(i -> i.end));
        int end = intervals.get(0).end;
        boolean can = true;

        for(int i=1;i<length;i++) {
            if(intervals.get(i).start < end) {
                can = false;
                break;
            }
            else {
                end = intervals.get(i).end;
            }
        }

        return can;
    }
}

