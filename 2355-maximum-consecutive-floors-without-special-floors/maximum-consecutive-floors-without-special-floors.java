class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int m=Math.max(special[0]-bottom,top-special[special.length-1]);
        for(int i=0;i<special.length-1;i++){
            m=Math.max(m,special[i+1]-special[i]-1);
        }
        return m;
    }
}