public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int c=0;
        for(int i =0;i<32;i++){
            c<<=1;
            c=c|(n&1);
            n>>=1;
        }
        return c;
    }
}