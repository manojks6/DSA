class Solution {
    public int maxScore(String s) {
        int pref[]=new int[s.length()];
        int suff[]=new int[s.length()];
        int m=-999,z=0;
        for(int i=0;i<s.length();i++){
            z+=s.charAt(i)=='0'?1:0;
            pref[i]=z;
        }
        z=0;
        for(int i=s.length()-1;i>=0;i--){
            z+=s.charAt(i)=='1'?1:0;
            suff[i]=z;
        }
        for(int i=0;i<s.length()-1;i++){
            m=Math.max(pref[i]+suff[i+1],m);
        }
        return m;
    }
}