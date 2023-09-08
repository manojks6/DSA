class Solution {
    public int minEatingSpeed(int[] piles, int h0) {
        int mx=Integer.MIN_VALUE,ans=-1;
        for(int i:piles){
            mx=Math.max(mx,i);
        }
        int l=1,h=mx;
        while(l<=h){
            int m=(l+h)/2;
            int x=f(piles,m);
            if(x<=h0){
                ans=m;
                h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
   static int f(int a[],int r){
        int c=0;
        for(int i:a){
            if(i<r){
                c+=1;
            }
            else{
                c+=Math.ceil((double)i/(double)r);
            }
        }
        return c;
    }
}