class Solution {
    public int totalFruit(int[] tree) {
        int start = 0;
        int end = 0;
        int max = 1;
        Map<Integer,Integer> map = new HashMap();
        for( end = 0; end < tree.length;end++){
            map.put(tree[end], map.getOrDefault(tree[end], 0) + 1);
            while(map.size()>2){
                map.put(tree[start],map.get(tree[start])-1);
                if(map.get(tree[start])==0)
                    map.remove(tree[start]);
                start++;
            }
            max = Math.max(max, end-start+1);
        }
        return max;
    }
}
