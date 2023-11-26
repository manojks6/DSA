class Solution {
    public int reverse(int x) {
        int f=0;
        long res=0;
        while(x!=0){
            int n=x%10;
            res=res*10+n;
            x=x/10;
        }
        if(res>Integer.MAX_VALUE || res<Integer.MIN_VALUE){
            return 0;
        }
        return x<0?(int)(-1*res):(int)(res);
    }
}