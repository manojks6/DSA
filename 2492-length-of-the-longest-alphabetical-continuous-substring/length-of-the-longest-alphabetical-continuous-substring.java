class Solution {
    public int longestContinuousSubstring(String s) {
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        int count=1,m=-99999999;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i)-s.charAt(i-1)==1){
                count++;
                m=Math.max(count,m);
            }
            else{
                count=1;
            }
            i++;
        }
        return m==-99999999?1:m;
    }
}