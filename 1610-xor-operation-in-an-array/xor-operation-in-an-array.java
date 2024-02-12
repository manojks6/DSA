class Solution {
    public int xorOperation(int n, int start) {
        int xor=start;
        for(int i=1;i<n;i++){
            int c=start+2*i;
            xor^=c;
        }
        return xor;
    }
}