class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int count=0,m=0,j=0;
        if(s.length()==0 || s.length()==1){
            return s.length();
        }
        for(int i=0;i<s.length();i++){
            while(j<i && set.contains(s.charAt(i))){
                set.remove(s.charAt(j++));
            }
            set.add(s.charAt(i));
                m=Math.max(m,set.size());
        }
        return m;
    }
}