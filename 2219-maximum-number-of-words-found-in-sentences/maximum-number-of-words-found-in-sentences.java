class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length,m=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int k=sentences[i].split(" ").length;
            m=Math.max(m,k);
        }
        return m;
    }
}