//         }
//         int finalArray[][] = new int[result.size()][2];
//         int count = 0;
//         for(Interval temp : result){
//             finalArray[count][0] = temp.start;
//             finalArray[count][1] = temp.end;
//             count++;
//         }
//         return finalArray;
//     }
// }
​
​
//*************************Another approach **********************************
​
class Solution {
    public int[][] merge(int[][] intervals) {
       
        Collections.sort(Arrays.asList(intervals),(a,b)-> a[0]-b[0]);
        LinkedList<int[]> result = new LinkedList<>();
       
        for(int[] interval : intervals){
             if(result.isEmpty() || result.getLast()[1]< interval[0]){
                result.add(interval);
            }
            else{
                 result.getLast()[1] = Math.max(result.getLast()[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
