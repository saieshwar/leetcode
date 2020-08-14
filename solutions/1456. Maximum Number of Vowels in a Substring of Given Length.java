class Solution {
    public int maxVowels(String s, int k) {
        int start = 0;
        int max = Integer.MIN_VALUE;
        int vowelcount =0;
        for(int end = 0 ; end < s.length();end++){
            if(isVowel(s.charAt(end))){
                vowelcount++;
            }
            if(end-start+1>k) {
                if(isVowel(s.charAt(start)))
                    vowelcount--;
                start++;
            }
            max= Math.max(max,vowelcount);
        }
        
     return max;
    }
    private boolean isVowel(char ch){
         if(ch == 'a' || ch == 'e'||ch=='i' || ch =='o'||ch=='u')
             return true;
         return false;
    }
}
​
