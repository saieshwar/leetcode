class Interval{
    int start;
    int end;
    Interval(int start,int end){
        this.start = start;
        this.end = end;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<Interval> link = new LinkedList<>();
        for(int temp[] : intervals){
            link.add(new Interval(temp[0],temp[1]));
        }
        Collections.sort(link,(l1,l2)->l1.start-l2.start);
        LinkedList<Interval> result = new LinkedList<>();
        for(Interval curr : link){
            if(result.isEmpty() || result.getLast().end < curr.start){
                result.add(curr);
            }
            else{
                 result.getLast().end = Math.max(result.getLast().end, curr.end);
            }
        }
        int finalArray[][] = new int[result.size()][2];
        int count = 0;
        for(Interval temp : result){
            finalArray[count][0] = temp.start;
            finalArray[count][1] = temp.end;
            count++;
        }
        return finalArray;
    }
}
