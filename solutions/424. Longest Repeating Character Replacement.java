class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==0)
            return 0;
        int start = 0 ;
        int end = 0;
        int charCount[] = new int[26];
        int maxCharCount =0;
        int max = Integer.MIN_VALUE;
        for(end = 0; end < s.length();end++){
            charCount[s.charAt(end)-'A']++;
             maxCharCount = Math.max(maxCharCount,charCount[s.charAt(end)-'A']);
                 while(end-start+1-maxCharCount>k){
                     charCount[s.charAt(start)-'A']--;
                     start++;
                 }
            max = Math.max(max, end-start+1);          
        }
        return max;
    }
}
