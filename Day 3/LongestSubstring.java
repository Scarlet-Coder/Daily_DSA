class LongestSubstring {
    public int longestContinuousSubstring(String s) {
        int max=0,c=1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)+1==s.charAt(i+1))
                c++;
            else{
                max=Math.max(c,max);
                c=1;
            }
        }
        max=Math.max(c,max);
        return max;
    }
}
