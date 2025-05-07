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
    public int minMeetingRooms(List<Interval> intervals) {
        if(intervals.size()==0) return 0;
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        // intervals.forEach(System.out::println);
        HashMap<Integer, Integer> map = new HashMap<>();

        int day = 1;
        map.put(1, intervals.get(0).end);
        intervals.remove(0);

        boolean bool = false;

        for(Interval interval : intervals) {
            bool = false;
            for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
                if(entry.getValue() <= interval.start) {
                    bool = true;
                    map.put(entry.getKey(), interval.end);
                    break;
                }
            }
            if(!bool) {
                map.put(++day, interval.end);
            }
        }
        return day;
    }
}

