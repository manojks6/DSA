class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0)
            return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int n=Math.min(first.length(),last.length());
        int i=0;
        String s="";
        while(i<n){
            if(first.charAt(i)==last.charAt(i)){
                s+=strs[0].charAt(i);
                i++;
            }
            else{
                break;
            }
            
        }
        return s;
        
    }
}