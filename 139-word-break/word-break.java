class Solution {
    static int DP[];
    public boolean wordBreak(String s, List<String> wordDict) {
        DP=new int[s.length()];
        Arrays.fill(DP,-1);
         return f(0,s,wordDict);
    }
    static boolean f(int ind,String s,List<String> l){
        if(ind>=s.length()){
            return true;
        }
        if(DP[ind]!=-1){
            return DP[ind]==1;
        }
        String t="";
        for(int i=ind;i<s.length();i++){
            t+=s.charAt(i);
            if(l.contains(t)){
                if(f(i+1,s,l)){
                    DP[ind]=1;
                    return true;
                }
            }
        }
        DP[ind]=0;
        return false;
    }
}